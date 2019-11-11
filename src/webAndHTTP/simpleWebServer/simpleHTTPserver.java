package webAndHTTP.simpleWebServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class simpleHTTPserver {
    public static void main(String[] args) {
        int count = 0; //variable for connections

        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Server started!");

            while (true) {
                // waiting for client connected
                Socket socket = serverSocket.accept();
                System.out.println("Client connected!");

                // opening streams for connected client, read/write
                try (BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
                     PrintWriter output = new PrintWriter(socket.getOutputStream())) {

                    //client connected
                    count++; //increase connection count

                    // waiting for first line from request
                    while (!input.ready()) ;

                    // print client request
                    System.out.println();
                    while (input.ready()) {
                        System.out.println(input.readLine());
                    }

                    // sending response
                    output.println("HTTP/1.1 200 OK");
                    output.println("Content-Type: text/html; charset=utf-8");
                    output.println();
                    output.println("<p>Hello from server</p>");
                    output.println("<p>connection count is: " + count);
                            output.println("</p>");
                    output.flush();


                    // at the end of try-catch block all streams and connection will be closed
                    System.out.println("Client disconnected!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
