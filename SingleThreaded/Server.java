import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public void run() {
        int port = 8080;
        ServerSocket socket = new ServerSocket(port);
        socket.setSoTimeout(10000);
        while (true) {
            try {
                System.out.println("Server is listening on port " + port);
                Socket acceptedConnection = socket.accept();
                System.out.println("Client connected: " + acceptedConnection.getInetAddress());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
    }
}