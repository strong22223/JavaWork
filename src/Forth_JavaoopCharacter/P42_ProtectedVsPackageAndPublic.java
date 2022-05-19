package Forth_JavaoopCharacter;

import three_LanguaheBasic.C;

public class P42_ProtectedVsPackageAndPublic {

    public static void main(String[] args) {
//			C obj=new C();
//			// obj.func();	//����C�����࣬����C��ͬһ����
//	         obj = new CSub(); ((CSub)obj).func();
        CSub sub = new CSub();
        sub.mtd();
        // sub.func();
        //((CSub)obj).mtd(obj, (CSub)obj);   // obj.mtd(obj, obj);
        //obj.mtd(obj, obj);
        //CSub bCSub= new CSub();
        //bCSub .mtd(obj, bCSub);
        //bCSub .c();
    }
}

class CSub extends C {
    //C�����࣬���Է���C��func()����

    private void c() {
        System.out.println("����");
    }

    void mtd() {
        C obj = new C();
        // obj.func();	//����C�����࣬����C��ͬһ����
        obj = new CSub();
        ((CSub) obj).func();
        func();
        //parent.func();      //����C�����࣬����C��ͬһ����
        //sub.func();
        c();
    }
}
	

