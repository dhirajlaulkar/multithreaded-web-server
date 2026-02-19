import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.Consumer;

public class server {

    return(clienSocket)->
    {
        try{
            PrintWriter toClient = new PrintWriter(clienSocket.getOutputStream(), true);
            toClient.println("Hello from server");
            toClient.close();
            clienSocket.close();
        }catch(IOException ex){
            System.out.println("Error handling client: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        int port = 8010;
        try{
            ServerSocket serverSocket = new ServerSocket(port);
            serverSocket.getSoTimeout(10000);
            System.out.println("server is listening on port " + port);
            while(true){
                Socket acceptedSocket = serverSocket.accept();
               Thread thread = new Thread();
            }
        }
    }
}