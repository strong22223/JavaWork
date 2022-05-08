package Five_Java_High_Level_Language_features;

    class T1 {
        String c="类加载的时间不会对普通变量进行操作";
        static int s1 = 1;
        static { System.out.println("static block of T1: " + T2.s2); }
        T1() { System.out.println("T1(): " + s1); }
    }
    class T2 extends T1 {
        static int s2 = 2;
        static { System.out.println("static block of T2: " + T2.s2); }
        T2() { System.out.println("T2(): " + s2); }
    }

public class P21_InheritStaticInit {
        public static void main(String[] args) {
            new T2();

    }

}
