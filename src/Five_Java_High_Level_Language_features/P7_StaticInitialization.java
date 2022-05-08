package Five_Java_High_Level_Language_features;
class Bowl {
    String c="普通变量的加载";
    static String v ="类加载的时间首先进行的是对静态变量的加载！";
    Bowl(int i) { System.out.println("Bowl(" + i + ")"); }
    void f1(int i) { System.out.println("f1(" + i + ")"); }
}
class Table {
    Bowl c= new Bowl(89);
    static Bowl bowl1 = new Bowl(1);
    Table() {
        System.out.println("Table()");
        bowl2.f1(1);
    }
    void f2(int i) { System.out.println("f2(" + i + ")"); }
    static Bowl bowl2 = new Bowl(2);
}
class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    Cupboard() {
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }
    void f3(int i) {
        System.out.println("f3(" + i + ")");
    }

    static Bowl bowl5 = new Bowl(5);
}

public class P7_StaticInitialization {

    public static void main(String [] args){

        System.out.println("new Cupboard() in main");
       Cupboard c= new Cupboard();
        System.out.println("new Cupboard() in main");
        new Cupboard();
//        table.f2(1);
//        cupboard.f3(1);

    }//
//    static Table table = new Table();
//    static int In=999;
//    static Cupboard cupboard = new Cupboard();

}
