package Forth_JavaoopCharacter;
import three_LanguaheBasic.*;
 
import static java.lang.Math.PI; 
class ASub extends A{
	void mtd (ASub sub) {
	 func();
//	 A cA=new A();
	// cA.func();
		//parentA .func();
		sub.func();
	}
}
public class P38_B extends ASub {
//包的相关问题，引入其他类的静态成员Static final 常量或者static方法
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A objA=new A();//A为three_LanguageBasic中的public类，所以在Torth包中的所有人都可以访问他
	//	A obA =new A("sds");
		P38_B p38_B=new P38_B();
		 //声明并且创建一个内部类，必须在创建外包类之后才能够在去实力话内部类。
		ASub i=new ASub();
		//objA.func();A类的protected方法不能在
		i.func();
		
	}
 
}
	