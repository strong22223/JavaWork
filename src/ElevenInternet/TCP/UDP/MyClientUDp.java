package ElevenInternet.TCP.UDP;
import java.net.*;
public class MyClientUDp {
    public static void main(String[] args) throws  Exception{
        InetAddress  address =  InetAddress.getByName("127.0.0.1");
        DatagramSocket socket = new DatagramSocket(1314, address);

        //�����������ݱ����ҷ���
        byte[]buffer =new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        socket.send(packet);



    }
}
