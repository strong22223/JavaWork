package Ten_Thread.Producer_Consumer;

import static java.lang.Math.random;

public class Producer implements Runnable {
   private SyncStack stack;
   private int num;
   private static int counter=1;

    public Producer(SyncStack stack) {
        this.stack = stack;
       num= this.counter++;
    }

    //run ��������������߳���,ÿ��˯������һ����ĸ����stack��
    //Ȼ������300ms,һ��200��
    public synchronized void run (){
        char c;
        for( int i=0;i<10;i++){
            c=(char)(random()*26+'A');
            stack.push(c);
            System.out.println("Producer"+num+":"+c);
            try{
                Thread.sleep(3000);
            }catch  (InterruptedException e){
                System.err.println(e.getStackTrace());
            }
        }
    }
}
