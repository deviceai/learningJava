package webAndHTTP.http;

import java.net.*;
import java.io.*;
import java.net.URL;

public class HttpURLConnection {
    public static void main(String[] args) throws Exception {
        URL site = new URL("http://www.google.com");
        java.net.HttpURLConnection siteCon = (java.net.HttpURLConnection) site.openConnection();

        System.out.println("Connection method: " + siteCon.getRequestMethod());
        System.out.println("Response code: " + siteCon.getResponseCode());
        System.out.println("Response answer: " + siteCon.getResponseMessage());

    }
}
