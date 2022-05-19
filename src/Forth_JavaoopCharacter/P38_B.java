package Forth_JavaoopCharacter;

import three_LanguaheBasic.A;

class ASub extends A {
    void mtd(ASub sub) {
        func();
//	 A cA=new A();
        // cA.func();
        //parentA .func();
        sub.func();
    }
}

public class P38_B extends ASub {
    //����������⣬����������ľ�̬��ԱStatic final ��������static����
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        A objA = new A();//AΪthree_LanguageBasic�е�public�࣬������Torth���е������˶����Է�����
        //	A obA =new A("sds");
        P38_B p38_B = new P38_B();
        //�������Ҵ���һ���ڲ��࣬�����ڴ��������֮����ܹ���ȥʵ�����ڲ��ࡣ
        ASub i = new ASub();
        //objA.func();A���protected����������
        i.func();

    }

}
	