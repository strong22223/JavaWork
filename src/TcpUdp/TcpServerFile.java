package TcpUdp;

import java.io.*;
 import java.net.*;

public class TcpServerFile {
    //�����
    public static void main(String[] args)throws Exception {
        //1.��������
        ServerSocket serverSocket=null;
        Socket socket=null;
        InputStream is=null;
        FileOutputStream fos=null;
        serverSocket=new ServerSocket(9980);
        //2.�����ͻ��˵�����
        socket=serverSocket.accept();//������ӣ���һֱ�ȴ��ͻ��˵�����
        //3����ȡ������
        is=socket.getInputStream();

        //4.�ļ����
        fos=new FileOutputStream(new File("xxx.jpg"));
        byte []buffer=new byte[1024];
        int len;
        while((len= is.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }

        System.out.println("�ɹ����գ�");
        OutputStream os=socket.getOutputStream();
        os.write("�ҽ��ܵ��ˣ����Ӵ�ر���".getBytes());
        //6.�ر���Դ
        fos.close();
        os.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
}
