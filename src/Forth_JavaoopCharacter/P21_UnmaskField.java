package Forth_JavaoopCharacter;

public class P21_UnmaskField {

    private int x = 1;
    private int y = 1;

    public static void main(String args[]) {
        P21_UnmaskField uf = new P21_UnmaskField();
        uf.PrintFields();
        uf.changeFields(10, 9);
        uf.PrintFields();
    }

    public void changeFields(int a, int b) {
        x = a;        //xָ��Ա����
        int y = b;    //�ֲ�����yʹͬ�������Ա����������
        this.y = 8;    //this.yָ��Ա����
        System.out.println("x=" + x + "; y=" + y); //�ֲ�����y��ֵ
    }

    public void PrintFields() {
        System.out.println("x=" + x + "; y=" + y);
    }
}