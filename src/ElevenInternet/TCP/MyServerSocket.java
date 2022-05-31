package ElevenInternet.TCP;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerSocket {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();

        //创建输入输出流
        //1.输入流
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
        //创建标准的输入流
        BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));

        out.println("你好!我是服务器\n");
        out.flush();
        String s  ;

        while (!(s=in.readLine()).equals("BYE")) {
            System.out.println("客户端:" +s);
            out.println(sin.readLine());
            out.flush();
        }


        sin.close();
        out.close();
        sin
                .close();
    }
}
