package ElevenInternet.TCP;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ClientSocket {
    public static void main(String[] args)throws   Exception {
        Socket socket = new Socket("localhost", 1314);

        //建立联机,并且从Socket中获取输入、输出流
        PrintStream ps = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //创建标准输入流,从标准输入太读取数据
    }
}
