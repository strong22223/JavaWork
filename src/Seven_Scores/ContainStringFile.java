package Seven_Scores;

import java.io.*;


public class ContainStringFile {
    public String fileList="";
     private void find(String filename,String string) throws IOException {
        BufferedReader flag=new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(filename) ,"utf8"));
        StringBuilder c=new StringBuilder();
        int b;
        while((b=flag.read())!=-1){
            c.append((char)b);
        }
        if((c.toString().contains(string))){
            fileList=fileList+filename+'\n';
        }
        flag.close();
    }
    public void findString(File filename,String string) throws IOException{
         //����һ��Ŀ¼���б�,
         for(String c :   filename.list()){
             String flag=filename+"\\"+c;
            File a=new File(flag);

            if(a.isDirectory()){
                this.findString(a,string);
            }
             else {
                find(flag,string);
            }
        }

    }

}
