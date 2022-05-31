package Ten_Thread;

public class ThreadTerminate {
    public static void main(String[] args)throws Exception {
        int i=0;
        Hello h=new Hello();
        Thread t=new Thread(h);
//        this.yield();
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();

        System.out.println("Please stop saying Hello and say good morning");

        while (i++<9999){
            System.out.println("Good Morning!"+(i-1));
        }  h.stopRunning();
    }
}
class Hello implements Runnable{
    int i=0;
    boolean timeToQuit=false;
    @Override
    public void run() {
        while(!timeToQuit){
            System.out.println("Hello"+i++);
            if(i%2==0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    public void stopRunning(){
        timeToQuit=true;
        System.out.println("Stop The Hello");
    }
}
