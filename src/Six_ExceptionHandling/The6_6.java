package Six_ExceptionHandling;

import java.awt.desktop.SystemSleepEvent;

class MyException extends Exception{
    MyException(){}
    MyException(String msg){
        super(msg);
    }
}

class UsingMyException {
    void f() throws MyException{
        System.out.println("Throws Myexception from f()");
        throw new MyException();
    }

    void g()throws MyException{
        System.out.println("Throws Myexception from g()");
        throw new MyException();
    }

}
public class The6_6 {
    public static void  main  (String [] args){
        UsingMyException c=new UsingMyException();
        try{
            c.f();
        }catch(MyException e){
            e.printStackTrace();
        }
        try{
            c.g();
        }catch(MyException e){
            e.printStackTrace();
        }

    }

}
