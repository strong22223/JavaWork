package Ten_Thread.Producer_Consumer;


public class Consumer implements  Runnable{
    private SyncStack stack;
    private int num;
    private static int counter = 1;

    public Consumer(SyncStack stack) {
        this.stack = stack;
        num=this.counter++;
    }

    //run 方法是生产这的线程体,每次睡觉产生一个字母放入stack中
    //然后休眠300ms,一共200次
    public synchronized void run() {
        char c;
        for (int i = 0; i < 10; i++) {
            c = stack.pop();
            System.out.println("Consumer" + num + ":" + c);
//            try {
//                Thread.sleep(300);
//            } catch (InterruptedException e) {
//                System.err.println(e.getStackTrace());
//            }
        }
    }
}
