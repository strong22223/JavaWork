package Forth_JavaoopCharacter;

class Window {
	Window(int m) { System.out.println("window " + m); }
}
class House {
	
	String dDString="ssss";
	int a;
	static int m=99;
	Window w1 = new Window(1);
	House() { 
		System.out.println("House");
		w3 = new Window(33);
	}
	Window w2 = new Window(2);
	void f() { System.out.println("∏∏¿‡f()"); }
	Window w3 = new Window(3);
	int c;
}
class Houses extends House{
	char x;
	static int s;
	 Houses(){
		 
	//	super();
	}
	
	int v;
	String vvString="◊”¿‡";
}
public class P51_OrderOfInit {
	public static void main(String[] args) {
		House h = new Houses();
		h.f();
	}
}