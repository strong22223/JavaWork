package Forth_JavaoopCharacter;

class Window {
    Window(int m) {
        System.out.println("window " + m);
    }
}

class House {

    static int m = 99;
    String dDString = "ssss";
    int a;
    Window w1 = new Window(1);
    Window w2 = new Window(2);
    Window w3 = new Window(3);
    int c;

    House() {
        System.out.println("House");
        w3 = new Window(33);
    }

    void f() {
        System.out.println("����f()");
    }
}

class Houses extends House {
    static int s;
    char x;
    int v;
    String vvString = "����";
    Houses() {

        //	super();
    }
}

public class P51_OrderOfInit {
    public static void main(String[] args) {
        House h = new Houses();
        h.f();
    }
}