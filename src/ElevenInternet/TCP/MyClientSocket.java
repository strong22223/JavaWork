package ElevenInternet.TCP;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class MyClientSocket {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 9999);

        //��������,���Ҵ�Socket�л�ȡ���롢�����
        PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //������׼������,�ӱ�׼����̫��ȡ����
        BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
        //�ӱ�׼�����ж�ȡ,�������뵽Server��

        out.println("���!���ǿͻ���\n");
        out.flush();
        String s=in.readLine();
        while(!(s=in.readLine()).equals("BYE"))
        {
        System.out.println("������:"+s);
            out.println(sin.readLine());
            out.flush();
         }
         sin.close();
        in.close();
        out.close();
    }
}
