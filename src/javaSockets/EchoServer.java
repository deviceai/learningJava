package javaSockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    private static final int PORT = 30000;

    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(PORT)){
            while(true){
                try (
                    Socket socket = server.accept();
                    DataInputStream input = new DataInputStream(socket.getInputStream());
                    DataOutputStream output = new DataOutputStream(socket.getOutputStream());
                ){
                    String msg = input.readUTF(); //reading a message
                    System.out.print("Received from client: ");
                    System.out.println(msg);
                    output.writeUTF(msg); //resend it to the client (echo)
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
