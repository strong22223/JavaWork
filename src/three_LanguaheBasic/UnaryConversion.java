package three_LanguaheBasic;

public class UnaryConversion {
    public static void main(String[] args) {
        byte b = 2;
        char c = '\u1234';
        int x = 8, y = 3;
        //byte b2 = -b; //intֵ����ֱ�Ӹ���byte���ͱ���b2
        //char c2 = +c; //intֵ����ֱ�Ӹ���char���ͱ���c2
        char c3 = c++;//
        System.out.println((-b) + ";" + (+c));
        int i = ~b;    //byteת��Ϊint
        System.out.println(i);
        System.out.println(Integer.toHexString(i));
        System.out.println(x / y);
        System.out.println(x / (float) y);

        int a = 1;
        double d = 1.0;
        System.out.println(a = 46 / 9);
        System.out.println(a = 46 % 9 + 4 * 4 - 2);
        System.out.println(a = 45 + 43 % 5 * (23 * 3 % 2));
        System.out.println(d = 4 + d * d + 4);
        a = 1;
        d = 1.0;
        System.out.println(d += 1.5 * 3 + (++a));
        a = 1;
        d = 1.0;
        System.out.println(d -= 1.5 * 3 + a++);
        long r = 34L;
        int a1 = 3;
        System.out.println(r / a1);


    }
}
