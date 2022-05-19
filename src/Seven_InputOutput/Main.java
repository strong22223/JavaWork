package Seven_InputOutput;

import java.io.File;

public class Main {
    public static void main (String args[]){

        System.out.println("Hello Word");
        byte[]buffer=new byte[1024];
        File a=new File( "D:\\WorkDoxc\\xd_javawork\\src\\Seven_InputOutput\\test");
        System.out.println(a.isDirectory());
    }
}
