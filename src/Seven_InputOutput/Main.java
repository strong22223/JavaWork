package Seven_InputOutput;

import java.io.IOException;

public class Main {
    public static void main (String args[]){

        System.out.println("Hello Word");
        byte[]buffer=new byte[1024];
        try{
            int len=System.in.read(buffer);
            String s=new String(buffer,0,len);
            System.out.printf("读到了"+len+"个字节");
            System.out.println(s);
            System.out.printf("s的长度是"+s.length());

        }catch(IOException e){
            e.getMessage();
        }
    }
}
