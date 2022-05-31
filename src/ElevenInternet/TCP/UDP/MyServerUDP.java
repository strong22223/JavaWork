package ElevenInternet.TCP.UDP;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.*;

public class MyServerUDP {
    DatagramSocket socket =null;
    BufferedReader in=null;
    boolean moreQuotes=true;
    public void serverWork() throws Exception{
        socket= new DatagramSocket(1314);
        in=new BufferedReader(new InputStreamReader(new FileInputStream("xxx.jpg")));
        //��������
        String s=null;
        while(moreQuotes){
            //���������������������
            byte[] buffer=new byte[1024];
            DatagramPacket packet=new DatagramPacket(buffer,buffer.length);
            socket.receive(packet);

            if((s=in.readLine())==null){
                moreQuotes=false;
                s="No more Bye!\n";
            }
            //�ӽ��ܵ������ݰ��л�ȡ,Client�ĵ�ַ�Ͷ˿�
            InetAddress address=socket.getInetAddress();
            int port =socket.getPort();
            packet=new DatagramPacket(buffer,buffer.length,address,port);
            socket.send(packet);
        }
        socket.close();
    }
    public static void main(String[] args) throws Exception {
     MyServerUDP server=new MyServerUDP();
     server.serverWork();
    }
}
