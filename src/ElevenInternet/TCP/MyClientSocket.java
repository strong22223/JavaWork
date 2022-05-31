package ElevenInternet.TCP;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class MyClientSocket {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 9999);

        //建立联机,并且从Socket中获取输入、输出流
        PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //创建标准输入流,从标准输入太读取数据
        BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
        //从标准输入中读取,并且输入到Server端

        out.println("你好!我是客户端\n");
        out.flush();
        String s=in.readLine();
        while(!(s=in.readLine()).equals("BYE"))
        {
        System.out.println("服务器:"+s);
            out.println(sin.readLine());
            out.flush();
         }
         sin.close();
        in.close();
        out.close();
    }
}
