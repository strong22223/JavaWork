package Seven_Scores;

import java.io.*;

public class UI {
public static boolean copy(File sources ,File goal) throws IOException{
    boolean canCopy=true;
    if(sources.getAbsolutePath()==goal.getAbsolutePath())canCopy=false;
    if(goal.exists())canCopy=false;
    if(!sources.exists())canCopy=false;

    if(!canCopy) {
        System.out.println("ERROR");
        return false;
    }else{
        DataInputStream in=
                new DataInputStream( new BufferedInputStream(
                        new FileInputStream(sources))
                );
        DataOutputStream out=new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(goal)
                )
        );
        while(in.available()>0)
            out.writeByte(in.readByte());
        in.close();
        out.close();
    }


    return true;
}
    public static void main(String [] args){

        File sources = new File(args[0]);
        File goal=new File(args[1]);

        File a=new File("testSevenContainStringFile");//testPackage
        ContainStringFile v=new ContainStringFile();



         try{
             UI.copy(sources,goal);//copy

             v.findString(a,"i love you");//findString
             System.out.println(v.fileList);//output StringPath

             NumberOfStatistical c= new NumberOfStatistical("English.txt");
             c.printInFile("result.txt");
             c.printInScreen();
             c.close();


         }catch(IOException e){
            System.err.println(e.getMessage());
        }
     }



 }
