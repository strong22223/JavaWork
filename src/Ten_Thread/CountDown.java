package Ten_Thread;

public class CountDown implements Runnable {
    private static int idcnt = 1;
    private final int threadid = idcnt++;
    int counter = 10;

    public static void main(String[] args) throws   Exception{
        Thread t1 = new Thread(new CountDown(), "T1");
        Thread t2 = new Thread(new CountDown(), "T2");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.setPriority(Thread.MIN_PRIORITY);//最高优先级
        t2.setPriority(Thread.MIN_PRIORITY);//最低的优先级

        //子类会继承父类的优先级
        t1.start();
        t2.start();

        System.out.println(t1.getName());
        System.out.println(t2.getName());
Thread.sleep(10_000);
        System.out.println("waiting for run...");
        Thread.currentThread();
    }

    public void run() {

        while (counter >= 0) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
            synchronized (this) {
                System.out.print(Thread.currentThread());
                System.out.println("#" + threadid +
                        (counter > 0 ? "->" + counter : "->run!"));
                counter--;
            }

        }
        Thread.currentThread();
    }
}