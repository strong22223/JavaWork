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

    //run 方法是生产这的线程体,每次睡觉产生一个字母放入stack中
    //然后休眠300ms,一共200次
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
