package webAndHTTP.http;

import java.io.InputStream;
import java.net.*;

public class URLConnectionTest {
    public static void main(String[] args) throws Exception{
        URL testURL = new URL("http://www.ya.ru");
        URLConnection someConn = testURL.openConnection();

        long d = someConn.getDate();
        System.out.println("Date: " + d);
        d = someConn.getExpiration();
        System.out.println("Exp: " + d);
        d = someConn.getLastModified();
        System.out.println("Last modf.: " + d);
        int len = someConn.getContentLength();
        System.out.println("Cont len: " + d);

        System.out.println("====== content =======");
        InputStream input = someConn.getInputStream();
        int i = len;
        int c;
        if (someConn.getContentLength() != 0) {
            while(((c = input.read()) != -1) && (--i > 0)){
                System.out.print((char)c);
            }
            input.close();
        }


    }
}
