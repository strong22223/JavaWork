package TcpUdp.File;
import java.net.*;
import java.io.*;
 public class TcpClientFile {
    //客户端
    public static void main(String[] args)throws Exception {
        // 1.创建一个Socket连接
        InetAddress serverIp = InetAddress.getByName("127.0.0.1");
        System.out.println(serverIp);
        int port = 9980;
        Socket socket = new Socket(serverIp,port);
        // 2.创建一个输出流
        OutputStream os = socket.getOutputStream();
        // 3.文件流  读取文件,读取在本地文件中的数据
        FileInputStream fis = new FileInputStream(new File("picture.jpg"));
        // 4.写出文件
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1){
            os.write(buffer,0,len);
        }

        // 5.通知服务器，文件写出结束了
        socket.shutdownOutput();

        // 6.服务器确定接收后断开服务
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer2 = new byte[1024];
        int len2;
        while ((len2=is.read(buffer2))!=-1){
            baos.write(buffer2,0,len2);
        }
        System.out.println(baos.toString());
        // 7.关闭资源
        baos.close();
        fis.close();
        os.close();
        is.close();
        socket.close();
       }
}
