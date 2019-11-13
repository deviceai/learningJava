package webAndHTTP.http;

import java.net.*;

public class InetAddress {
    public static void main(String[] args) throws UnknownHostException {
      java.net.InetAddress myaddress  = java.net.InetAddress.getLocalHost();
      System.out.println(myaddress);

      myaddress = java.net.InetAddress.getByName("google.com");
      System.out.println(myaddress);

      java.net.InetAddress list[] = java.net.InetAddress.getAllByName("ya.ru");
      for (int i=0; i<list.length; i++){
            System.out.println(list[i]);
        }
    }
}
