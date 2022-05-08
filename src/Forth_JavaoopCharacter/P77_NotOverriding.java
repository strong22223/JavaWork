package Forth_JavaoopCharacter;
class Base{
	public static int i=100;
	public void increase(){
		i++ ;
	}
	public static int getI(){
		return i;
	}
}

public class P77_NotOverriding extends Base{
	public static int i=5;
	public static int getI() {
		return i;
	}
	public void increase(){
		this.i=99;
		String string="sds";
	}
	public static void main(String[] args){
		P77_NotOverriding no=new P77_NotOverriding();
		//no.increase();//调用父类的，因为子类没有，将父类中的i自增变为101，而子类中的i变量是没有发生变化的
		
		System.out.println(no .i);
		System.out.println(no .getI());
		//将子类的对象强制准换为父类对象，所有的调用都是父类???
		Base cBase=no;//向上造型，子类中特有的东西被隐藏，但是继承的东西将使用子类的方法
		cBase.increase();//被覆盖的子类
		System.out.println(cBase .i);//访问的是父类中被隐藏的属性
		System.out.println(cBase .getI());//被覆盖的方法访问的是子类的
		System.out.println(no .getI());
	}
}
