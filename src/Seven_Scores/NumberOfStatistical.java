package Seven_Scores;

import java.io.*;

public class NumberOfStatistical {
    final int SIZE=26;//26个字母的数目
    private int numChar;
    private int numString=1;
    private int numParagraph;
    private int [] letter= new int[SIZE];
    DataInputStream io;
    String numberOfWord="numberOfWord:";
    String numberOfString="numberOfString:";
    String numberOfPargraph="numberOfPargraph:";
    NumberOfStatistical(String io) throws IOException{
         this.io=new DataInputStream(
                 new BufferedInputStream(
                         new FileInputStream(io)) );
    }
    /*
        统计出每一个字母的数量，不区分大小写，并且以 letter:number的形式输出
    */
    private final String getNumberOfLetter() throws IOException {
        char flag;
        io.mark( io.available());//标记当前流的的标记，之后通过reset（）方法对从标记开始的方法读取
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
         return a.toString();
    }
    /*
        统计出字符串的数量，并且输出
     */
    private  final int getNumberOfString () throws IOException{
        io.reset();//回流
        char flag;
        String str=new String();
        if(io.available()==0){
            numString=0;
            numParagraph=0;
        }
        boolean a=false;
        while(io.available()>0){
            flag=(char)io.readByte();
            str=str+flag;
            if (flag=='\r')a=true;
            if(a&&flag=='\n')numParagraph++;
        }
        str=str.trim();//去除前后空格
        int i=0;
        for(char c:str.toCharArray()){
            if(c==' ')
            numString++;
        }
        System.out.println(str);

        return this.numString;
    }
//     private final int getNUmberOfpargraph()throws IOException{}
    /*
        将结果作为文件输出
     */
    public void printInFile(String Out) throws IOException {

        this.getNumberOfLetter();
        int an=this.getNumberOfString();
         FileWriter file=new FileWriter(Out);
        file.write(numberOfWord+this.getNumberOfLetter()+"\n"+ numberOfString+an+"\n");
        file.close();
    }
    /*
         将结果直接输出在标准输出
     */
    public void printInScreen() throws IOException{
        System.out.println(numberOfWord+this.getNumberOfLetter()+'\n'
        +numberOfString+this.getNumberOfString()+'\n'+numberOfPargraph+this.numParagraph+'\n');
    }
//    public void
    public void close() throws IOException {
        io.close();
    }
    public static void main(String []args) {
            try{
                NumberOfStatistical a= new NumberOfStatistical("English.txt");
//                a.printInFile("result.txt");
                a.printInScreen();
                a.close();
            }catch (IOException e){
                System.err.println(e.getMessage());
            }


    }
}


