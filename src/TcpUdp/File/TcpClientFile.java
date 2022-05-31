package TcpUdp.File;
import java.net.*;
import java.io.*;
 public class TcpClientFile {
    //�ͻ���
    public static void main(String[] args)throws Exception {
        // 1.����һ��Socket����
        InetAddress serverIp = InetAddress.getByName("127.0.0.1");
        System.out.println(serverIp);
        int port = 9980;
        Socket socket = new Socket(serverIp,port);
        // 2.����һ�������
        OutputStream os = socket.getOutputStream();
        // 3.�ļ���  ��ȡ�ļ�,��ȡ�ڱ����ļ��е�����
        FileInputStream fis = new FileInputStream(new File("picture.jpg"));
        // 4.д���ļ�
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1){
            os.write(buffer,0,len);
        }

        // 5.֪ͨ���������ļ�д��������
        socket.shutdownOutput();

        // 6.������ȷ�����պ�Ͽ�����
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer2 = new byte[1024];
        int len2;
        while ((len2=is.read(buffer2))!=-1){
            baos.write(buffer2,0,len2);
        }
        System.out.println(baos.toString());
        // 7.�ر���Դ
        baos.close();
        fis.close();
        os.close();
        is.close();
        socket.close();
       }
}
