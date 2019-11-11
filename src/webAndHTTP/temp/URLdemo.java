package webAndHTTP.temp;

import java.net.*;

public class URLdemo {
    public static void main(String[] args) throws MalformedURLException{
        URL testUrl = new URL("https://www.google.com:80/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
        System.out.println("Protocol: " + testUrl.getProtocol());
        System.out.println("Port:" + testUrl.getPort());
        System.out.println("Host: " + testUrl.getHost());
        System.out.println("Fail: " + testUrl.getFile());
        System.out.println("All:" + testUrl.toExternalForm());


    }
}
