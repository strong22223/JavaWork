package three_LanguaheBasic;

public class A {
    public A() {
        System.out.println("A's constructor");
    }//A�й��췽��Ϊpublic�������˶����Է�����

    private A(String a) {
        System.out.println("A's constructor");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public void func() {
        System.out.println("Protected menthon of A");
    }

    //void func(){ System.out.println("A's method"); } //func()Ϊ��Ȩ��
    class A1 {//Ĭ�ϵ�Ϊ��Ȩ���ǲ��ܱ�

    }

}
