package Ten_Thread;

public class TestStopThread {

    public static void main(String[] args)throws Exception {
        Tick t=new Tick();
        new Thread(t).start();
        Thread.sleep(3000);
        System.out.println("quiting Task-----");
        t.stopRunning();
    }
}

class Tick implements Runnable{
    private boolean timeToQuit=false;
    public void stopRunning(){
        timeToQuit=true;
    }
    public void run(){
        while(!timeToQuit){
            try{
                Thread.sleep(1000);
                System.out.println("tick---");
            }catch(Exception e){}
        }
        System.out.println("Tick Finished .");
    }


}
