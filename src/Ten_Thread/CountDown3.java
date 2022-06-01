package Ten_Thread;

public class CountDown3 {
    static int idcnt = 1;

    public static void main(String[] args) {
        new SubThread().start();
        new Thread(new Run()).start();

    }
}

class SubThread extends Thread {
    private final int threadid = CountDown3.idcnt++;

    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("#" + threadid);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Parent {
    public void doSth() {
        System.out.println("do something ...");
    }
}

class Run extends Parent implements Runnable {
    private final int threadid = CountDown3.idcnt++;

    public void run() {
        try {
            Thread.sleep(1000);
            System.out.print("-------------" + threadid + ": ");
            doSth();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
