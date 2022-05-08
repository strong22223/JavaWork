package Forth_JavaoopCharacter;

public class P78_PrivOverride {
	private void f() { System.out.println("private f()"); }
	int a=0;
	public static void main(String[] args) {
		P78_PrivOverride po = new Derived();
		po.f();
		
		Derived iDerived=new Derived();
		iDerived .f();
		iDerived .s();
	//	P78_PrivOverride cOverride=new Derived() ;
		P78_PrivOverride cOverride=iDerived ;
		
		cOverride .f();//没有被覆盖苏哦一访问的直接是private。
		System .out .println(cOverride.a);
	}
}
class Derived extends P78_PrivOverride {
	public int a=9;
	public void s() {}
	public void f() { System.out.println("public f()"); }//没有被覆盖，所以访问的
}
