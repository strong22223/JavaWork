package Six_ExceptionHandling;

import java.io.IOException;
import java.sql.SQLSyntaxErrorException;

class Test {
    int[] num1 = {1,};
    int[] num2 = {2, 2};
    int[] num3 = {3, 3, 3};

    void Exception1() throws IndexOutOfBoundsException {
        for (int i = 0; i < 4; i++)
            System.out.println(num1[i]);
    }

    void Exception2() throws IndexOutOfBoundsException {
        for (int i = 0; i <= 9; i++)
            System.out.println(num2[i]);
    }

    void Exception3() throws IndexOutOfBoundsException {
        for (int i = 0; i <= 9; i++)
            System.out.println(num3[i]);
    }

    int c = 9;

    int test() {

        try {
//            this.Exception1();//方法内数组个数为1，会产生越界1
            int v = 0;
            return c + 1;
        } catch (IndexOutOfBoundsException e) {
//            System.err.println(e.getMessage());
//           this.Exception2();//方法内数组个数为2，会产生越界2
            return c;
        } finally {
//            this.Exception3();//方法内数组个数为3，会产生越界3
            c = 2;
//           return  c;//c=9
        }
    }
}

public class Six2_a {
    public static void main(String[] args) {
        Test c = new Test();
//        c.testException();
        try {
            int retuRn = c.test();
            System.out.println("return =" + retuRn);
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }
}

