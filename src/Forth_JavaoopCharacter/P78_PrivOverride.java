package Forth_JavaoopCharacter;

public class P78_PrivOverride {
    int a = 0;

    public static void main(String[] args) {
        P78_PrivOverride po = new Derived();
        po.f();

        Derived iDerived = new Derived();
        iDerived.f();
        iDerived.s();
        //	P78_PrivOverride cOverride=new Derived() ;
        P78_PrivOverride cOverride = iDerived;

        cOverride.f();//û�б�������Ŷһ���ʵ�ֱ����private��
        System.out.println(cOverride.a);
    }

    private void f() {
        System.out.println("private f()");
    }
}

class Derived extends P78_PrivOverride {
    public int a = 9;

    public void s() {
    }

    public void f() {
        System.out.println("public f()");
    }//û�б����ǣ����Է��ʵ�
}
