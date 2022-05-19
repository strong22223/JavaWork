package Five_Java_High_Level_Language_features;

class StaticSuper {
    static String a = "SuperBASE";
    String b = "Superbbbb";

    public static String staticGet() {
        return "Base staticGet()";
    }

    public String dynamicGet() {
        return "Base dynamicGet()";
    }
}

class StaticSub extends StaticSuper {
    static String a = "SubBASE";
    String b = "Subbbbb";

    public static String staticGet() {
        return "Derived staticGet()";
    }

    public String dynamicGet() {
        return "Derived dynamicGet()";
    }
}

public class P18_StaticPoly {
    public static void main(String[] args) {
        StaticSuper sup = new StaticSub(); //����ת��
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());
        System.out.println(sup.a);
        System.out.println(sup.b);

    }
}