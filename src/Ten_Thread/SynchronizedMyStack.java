package Ten_Thread;

public class SynchronizedMyStack {
    private final int MAX = 999;
    private int idx = 0;
    private char[] data = new char[MAX];

    public void push(char c) {
        synchronized (this) {
            data[idx] = c;
            this.idx++;
        }
    }

    public char pop() {
        synchronized (this) {
            idx--;
            return data[idx];
        }
    }

    public int getIdx() {
        return this.idx;
    }

    public static void main(String[] args) {
        SynchronizedMyStack myStack = new SynchronizedMyStack();
        new A(myStack).start();
        new B(myStack).start();

    }
}

class B extends Thread {
    SynchronizedMyStack s;

    public B(SynchronizedMyStack s) {
        this.s = s;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (s.getIdx() > 0) {
                char c = s.pop();
                System.out.println("B:POP " + c);
            }
        }
    }
}

class A extends Thread {
    SynchronizedMyStack s;

    public A(SynchronizedMyStack s) {
        this.s = s;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (s.getIdx() < 5) {
                char c = (char) (Math.random() * 26 + 'A');
                s.push(c);
                System.out.println("A:PUSH  " + c);
            }
        }
    }
}
