package ElevenInternet.TCP;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ClientSocket {
    public static void main(String[] args)throws   Exception {
        Socket socket = new Socket("localhost", 1314);

        //��������,���Ҵ�Socket�л�ȡ���롢�����
        PrintStream ps = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //������׼������,�ӱ�׼����̫��ȡ����
    }
}
