package Seven_Scores;

import java.io.*;

public class NumberOfStatistical {
    final int SIZE=26;//26����ĸ����Ŀ
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
        io.mark( io.available());//��ǵ�ǰ���ĵı�ǣ�֮��ͨ��reset���������Դӱ�ǿ�ʼ�ķ�����ȡ
    }
    /*
        ͳ�Ƴ�ÿһ����ĸ�������������ִ�Сд�������� letter:number����ʽ���
    */
    private final void getNumberOfLetter() throws IOException {
        io.reset();//����
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
        ͳ�Ƴ��ַ������������������
     */
    private  final void getNumberOfString () throws IOException{
        io.reset();//����
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
        str=str.trim();//ȥ��ǰ��ո�
        int i=0;
        for(char c:str.toCharArray()){
            if(c==' ')
            this.numString++;
        }

     }
     /*
        �������Ϊ�ļ����
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
         �����ֱ������ڱ�׼���
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


