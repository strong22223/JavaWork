package Forth_JavaoopCharacter;

//public class PassTest {
//	public void changeInt(int value) {// 基本类型的参数
//		System .out.println("value is "+value);
//		value = 55;
//		System .out .println("value is "+value);
//		
//		 
//	}
//	public static void main(String args[]) {
//		int val;
//		PassTest pt = new PassTest();
//
//		val = 11;
//		pt.changeInt(val); // 基本类型参数的值传递
//		System.out.println("Int value is: " + val);
//	}
//}
//public class PassTest {
//	public void changeStr(String value) {  // 引用类型参数
//		System .out.println("value is "+value);
//		value = "defferent";
//		System .out .println("value is "+value);
////		
//	}
//	public static void main(String args[]) {
//		String str;
//		PassTest pt = new PassTest();
//
//		str = new String("Hello");
//		pt.changeStr(str); // 引用类型参数的传递
//		System.out.println("Str value is: " + str);
//	}
//}
public class PassTest {
	float ptValue;
	public void changeObjValue(PassTest ref) {// 引用类型参数
		ref.ptValue = 99.0f;  //改变参数所指对象的成员变量值
	}
	public static void main(String args[]) {
		PassTest pt = new PassTest();

		pt.ptValue = 101.0f;
		pt.changeObjValue(pt); // 引用类型参数的传递
		System.out.println("Pt value is: " + pt.ptValue);
	}
}
