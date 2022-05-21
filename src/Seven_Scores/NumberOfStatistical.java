package Seven_Scores;

import java.io.*;

public class NumberOfStatistical {
    final int SIZE=26;//26个字母的数目
    String numLetter;
     private int numString=1;
    private int numParagraph;
    private int [] letter= new int[SIZE];
    DataInputStream io;
     String numberOfWord="numberOfWord:";
    String numberOfString="numberOfString:";
    String numberOfParagraph="numberOfParagraph:";
    boolean reserved =false;
    NumberOfStatistical(String io) throws IOException{
         this.io=new DataInputStream(
                 new BufferedInputStream(
                         new FileInputStream(io)) );
         this.mark();
    }
    private void mark() throws IOException{
        io.mark( io.available());//标记当前流的的标记，之后通过reset（）方法对从标记开始的方法读取
    }
    /*
        统计出每一个字母的数量，不区分大小写，并且以 letter:number的形式输出
    */
    private final void getNumberOfLetter() throws IOException {
        io.reset();//回流
        char flag;
         StringBuilder a=new StringBuilder();
        while(io.available()>0){
            flag=(char)io.readByte();
            if(Character.isLetter(flag)){
                Character.toLowerCase(flag);
                letter[flag-'a']++;
            }
        }


        char ch= 'A';
        for(int c:letter){
            a.append((ch++)+":"+c+" ");
        }
      this.numLetter=  a.toString();
    }
    /*
        统计出字符串的数量，并且输出
     */
    private  final void getNumberOfString () throws IOException{
        io.reset();//回流
        char flag;
        String str=new String();
        if(io.available()==0){
            this.numString=0;
            this.numParagraph=0;
        }
        boolean a=false;
        while(io.available()>0){
            flag=(char)io.readByte();
            str=str+flag;
            if (flag=='\r')a=true;
            if(a&&flag=='\n')this.numParagraph++;
        }
        str=str.trim();//去除前后空格
        int i=0;
        for(char c:str.toCharArray()){
            if(c==' ')
            this.numString++;
        }

     }
     /*
        将结果作为文件输出
     */
    public void printInFile(String Out) throws IOException {
        if(!reserved){
            this.getNumberOfLetter();
            this.getNumberOfString();
        }
        FileWriter file=new FileWriter(Out);

        file.write(numberOfWord+this.numLetter+"\n"+ numberOfString+this.numString+"\n"+numberOfParagraph+this.numParagraph+'\n');
        file.close();
        reserved=true;
    }
    /*
         将结果直接输出在标准输出
     */
    public void printInScreen() throws IOException{
        if(!reserved){
            this.getNumberOfLetter();
             this.getNumberOfString();
       }
        System.out.println( numberOfWord+this.numLetter+"\n"+ numberOfString+this.numString+"\n"+numberOfParagraph+this.numParagraph+'\n');
        reserved=true;
    }
//    public void
    public void close() throws IOException {
        io.close();
    }

}


