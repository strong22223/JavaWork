package Seven_Scores;

import java.io.*;

public class NumberOfStatistical {
    final int SIZE=24;//24����ĸ����Ŀ
    private int numChar;
    private int numString;
    private int [] letter= new int[SIZE];
    BufferedReader io;
    String numberOfWord="numberOfWord:";
    String numberOfString="numberOfString:";
    NumberOfStatistical(String io) throws IOException{
         this.io=new BufferedReader(
                 new InputStreamReader(
                         new FileInputStream(io),"utf8") );
    }
    /*
        ͳ�Ƴ�ÿһ����ĸ�������������ִ�Сд�������� letter:number����ʽ���
    */
    private final String getNumberOfLetter() throws IOException {
        StringBuilder a=new StringBuilder();
        int flag ;
        while((flag= io.read())!=-1){
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
        ͳ�Ƴ��ַ������������������
     */
    private  final int getNumberOfString () throws IOException {
        int flag;
        while((flag=io.read())!=-1)
            this.numString++;

        return this.numString;
    }
    /*
        �������Ϊ�ļ����
     */
    public void printInFile(String Out) throws IOException {

        this.getNumberOfLetter();
        int an=this.getNumberOfString();
         FileWriter file=new FileWriter(Out);
        file.write(numberOfWord+this.getNumberOfLetter()+"\n"+ numberOfString+an+"\n");
        file.close();
    }
    /*
         �����ֱ������ڱ�׼���
     */
    public void printInScreen() throws IOException{
        System.out.println(numberOfWord+this.getNumberOfLetter()+'\n'
        +numberOfString+this.getNumberOfString()+'\n');
    }
//    public void
    public void close() throws IOException {
        io.close();
    }
    public static void main(String []args) {
            try{
                NumberOfStatistical a= new NumberOfStatistical("D:\\WorkDoxc\\xd_javawork\\src\\Seven_InputOutput\\English.txt");
                a.printInFile("result.txt");
                a.printInScreen();
                a.close();
            }catch (IOException e){
                System.err.println(e.getMessage());
            }


    }
}


