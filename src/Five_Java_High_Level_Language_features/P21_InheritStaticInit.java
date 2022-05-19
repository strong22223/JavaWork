package Five_Java_High_Level_Language_features;

class T1 {
    static int s1 = 1;

    static {
        System.out.println("static block of T1: " + T2.s2);
    }

    String c = "����ص�ʱ�䲻�����ͨ�������в���";

    T1() {
        System.out.println("T1(): " + s1);
    }
}

class T2 extends T1 {
    static int s2 = 2;

    static {
        System.out.println("static block of T2: " + T2.s2);
    }

    T2() {
        System.out.println("T2(): " + s2);
    }
}

public class P21_InheritStaticInit {
    public static void main(String[] args) {
        new T2();

    }

}
