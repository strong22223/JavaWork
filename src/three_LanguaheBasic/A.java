package three_LanguaheBasic;

public class A {
	public void func() {System.out.println("Protected menthon of A");}
	public A(){ System.out.println("A's constructor"); }//A中构造方法为public，所有人都可以访问它
	private A(String a) {
		 System.out.println("A's constructor");
	}
	//void func(){ System.out.println("A's method"); } //func()为包权限
	class A1{//默认的为包权限是不能被
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
 
}
