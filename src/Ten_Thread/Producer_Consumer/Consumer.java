package Ten_Thread.Producer_Consumer;


public class Consumer implements  Runnable{
    private SyncStack stack;
    private int num;
    private static int counter = 1;

    public Consumer(SyncStack stack) {
        this.stack = stack;
        num=this.counter++;
    }

    //run ��������������߳���,ÿ��˯������һ����ĸ����stack��
    //Ȼ������300ms,һ��200��
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
