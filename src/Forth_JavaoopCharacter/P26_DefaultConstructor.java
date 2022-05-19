package Forth_JavaoopCharacter;

class Bird {
    int i;
    double j;
    String string;
    boolean s;

    public Bird(int j) {
        i = j;
    }
}

public class P26_DefaultConstructor {
    public static void main(String[] args) {
        Bird nc = new Bird(1); // ȱʡ���췽��
        System.out.println("init int is:" + nc.i);
        System.out.println("init double is:" + nc.j);
        System.out.println("init int String is :" + nc.string);
        System.out.print("init boolean is:" + nc.s);
    }
}