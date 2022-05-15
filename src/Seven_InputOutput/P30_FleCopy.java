package Seven_InputOutput;

import java.io.*;

public class P30_FleCopy {

        public static void main(String[] args) throws IOException{
            File fIn=new File("D:\\WorkDoxc\\xd_javawork\\src\\Seven_InputOutput\\1.txt");
           File Fou=new File( "D:\\WorkDoxc\\xd_javawork\\src\\Seven_InputOutput\\2.txt");
            try{
                FileInputStream in=new FileInputStream(fIn);
                FileOutputStream out=new FileOutputStream(Fou);
                int c;
                while( (c=in.read())!=-1)
                    out.write(c);
                in.close();
                out.close();
            }catch(IOException e){
                System.err.println(e.getMessage());
            }

        }
    }
