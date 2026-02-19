import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.Consumer;

public class server {

    public Consumer<Socket> getConsumer() {
        return (clientSocket) -> {
            try {
                PrintWriter toClient = new PrintWriter(clientSocket.getOutputStream(), true);
                toClient.println("Hello from server");
                toClient.close();
                clientSocket.close();
            } catch (IOException ex) {
                System.out.println("Error handling client: " + ex.getMessage());
            }
        };
    }

    public static void main(String[] args) {
        int port = 8010;
        try{
            ServerSocket serverSocket = new ServerSocket(port);
            serverSocket.setSoTimeout(10000);
            System.out.println("server is listening on port " + port);
            while(true){
                Socket acceptedSocket = serverSocket.accept();
               Thread thread = new Thread();
            }
        }
    }
}