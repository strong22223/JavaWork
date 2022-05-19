package three_LanguaheBasic;

public class CastingRoundingNumber {
    public static void main(String[] args) {
        double above = 0.7;
        double below = 0.4;
        float fabove = 0.7f;
        float fbelow = 0.4f;
        System.out.println("(int)above: " + (int) above);
        System.out.println("(int)below: " + (int) below);
        System.out.println("(int)fabove: " + (int) fabove);
        System.out.println("(int)fbelow: " + (int) fbelow);
        System.out.println("Math.round(above): " + Math.round(above));
        System.out.println("Math.round(below): " + Math.round(below));
        System.out.println("Math.round(fabove): " + Math.round(fabove));
        System.out.println("Math.round(fbelow): " + Math.round(fbelow));

        float f = 12.5F;
        int i = (int) f;
        System.out.println(f);
        System.out.println(i);
//	        int arry[]=new int [100];
//	        Boolean b=true;
//	        int L=(int)b;
//	        MyDate mmDate=new MyDate();
//	        int XX=(MyDate )mmDate ;
//	        int CC=(int)
//	       // float k=b;
//	        int x=1;
//	        int y=3;
//	        System .out.print(x>y>0);
//	        System .out .print(x=y&&y);
        //      System .out.print(x/=y);
//	        System .out.print(x or y);
//	        System .out.print(x and y);
        //        System .out.print((x!=0)||(x==0));
        int a, num, c;
        a = num = c = 1;
        a = num += c = 5;
        System.out.println();
        // 62
        double item = 1, sum = 0;
        while (item - 0 > (1E-6)) {
            sum += item;
            item -= 0.2;
            System.out.println(sum + " " + item);
        }
        double s = 1E-3;
        System.out.print(s + "1E-6= ");


    }

    class MyDate {
        int month;
        int year;
    }
}
