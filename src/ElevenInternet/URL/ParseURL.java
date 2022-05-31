package ElevenInternet.URL;

import java.net.*;

public class ParseURL {
    public static void main(String[] args)throws Exception {
        URL aURL=new URL("https://java.com:80/docs/books/tutorial/index.html");
        System.out.println("protocol="+aURL.getProtocol());
        System.out.println("host ="+aURL.getHost());
        System.out.println("filename = "+aURL.getFile());
        System.out.println("port ="+aURL.getPort());
        System.out.println("ref ="+aURL.getRef());
    }
}
