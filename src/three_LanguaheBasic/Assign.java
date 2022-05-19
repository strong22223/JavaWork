package three_LanguaheBasic;

public class Assign {
    int x, y;

    public static void main(String args[]) {
        // �������ͱ���
        Assign assign = new Assign();

        float z = 3.414f;        // ��������ֵfloat�ͱ���
        double w = 3.1415;    // ��������ֵdouble�ͱ���
        //	System .out .print("x="+x+"y="+y+"z="+z+"w="+w);
        boolean truth = true;    // ��������ֵboolean�ͱ���
        char c;            // �����ַ�����
        String str;        // ����String���ͱ���
        String str1 = "bye";    // ��������ֵString���ͱ���
        //	x = 6;
        //	y = 1000; 		// ��int�ͱ�����ֵ
        //System .out .print("x="+x+" y="+y+" z="+z+" w="+w);
        c = 'A';            // ���ַ�������ֵ
        //	System .out .print("str="+str+" str1="+str1);
        str = "Hi out there";    // ��String������ֵ
        System.out.print("x=" + assign.x + " y=" + assign.y + " str=" + str + " str1=" + str1);
        System.out.println();
        System.out.println(12.3 + "\n" + 12.3e+2 + "\n" + 23.4e-2 + "\r" + -334.4 + "\n" + 20 + "\n" + 39F + "\n" + 40D);
        System.out.println("����20���Ǹ������������ǣ�");

        System.out.println(0.0 == -0.0);
        System.out.println(0.0 > -0.0);
        System.out.println("======================\n" + (1.0 > Double.NaN));
        System.out.println(1.0 < Double.NaN);
        System.out.println(1.0 == Double.NaN);
        System.out.println(1.0 != Double.NaN);
        System.out.println(Double.NaN == Double.NaN);
        System.out.println(0.0 / 0.0);//NAN����
        System.out.println(1.0 / 0.0);//����
        System.out.println(1.0 / -0.0);
        System.out.println((1.0 / -0.0) * 0);//����NAN


    }
}
 