package Seven_InputOutput;

import java.io.IOException;

public class Main {
    public static void main (String args[]){

        System.out.println("Hello Word");
        byte[]buffer=new byte[1024];
        try{
            int len=System.in.read(buffer);
            String s=new String(buffer,0,len);
            System.out.printf("������"+len+"���ֽ�");
            System.out.println(s);
            System.out.printf("s�ĳ�����"+s.length());

        }catch(IOException e){
            e.getMessage();
        }
    }
}
