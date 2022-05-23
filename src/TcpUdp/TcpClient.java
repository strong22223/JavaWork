package TcpUdp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
//
public class TcpClient {
    public static void main(String[] args) {
        Socket socket =null;
        OutputStream os=null;
        try{
            //1.Ҫ֪���������ĵ�ַ���˿�
            InetAddress serverIp=InetAddress.getByName("127.0.0.1");
            int port =9999;
            //2.����һ��Socket
            socket =new Socket(serverIp,port);
            //3.������Ϣ���൱������д
            os=socket.getOutputStream();
            String string="����ѧϰ������";
            os.write(string.getBytes());//���ַ�����ɢΪ�ֽ�����

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if (os != null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
           }
    }
}
