package Seven_Scores;

import java.io.*;

public class NumberOfStatistical {
    final int SIZE=26;//26����ĸ����Ŀ
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
        ͳ�Ƴ�ÿһ����ĸ�������������ִ�Сд�������� letter:number����ʽ���
    */
    private final String getNumberOfLetter() throws IOException {
        char flag;
        io.mark( io.available());//��ǵ�ǰ���ĵı�ǣ�֮��ͨ��reset���������Դӱ�ǿ�ʼ�ķ�����ȡ
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
        ͳ�Ƴ��ַ������������������
     */
    private  final int getNumberOfString () throws IOException{
        io.reset();//����
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
        str=str.trim();//ȥ��ǰ��ո�
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


