package Five_Java_High_Level_Language_features;

class Poppet {
    private int i;

    Poppet(int ii) {
        i = ii;
    }
}

public class P31_BlankFinal {
    private final int i = 0;    // ����ʼ����final
    private final int j;    // �հ�final
    private final Poppet p;    // �հ�final����

    public P31_BlankFinal() {
        Poppet p1;
        j = 1;            // ��ʼ���հ�final
        p = new Poppet(1);    // ��ʼ���հ�final����
//      p=new Poppet(3);
    }

    public P31_BlankFinal(int x) {
        j = x;            // ��ʼ���հ�final
        p = new Poppet(x);    // ��ʼ���հ�final����
    }

    public static void main(String[] args) {
//        new P31_BlankFinal();
//        new P31_BlankFinal(47);


    }
}        // ������Customer.java
