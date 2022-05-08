package Forth_JavaoopCharacter;

import three_LanguaheBasic.C;

public class Test {

	public static void main(String[] args) {
		MyNaturalNumbers x=new MyNaturalNumbers("7867");
		MyNaturalNumbers y=new MyNaturalNumbers("7867312");
		MyNaturalNumbers z=new MyNaturalNumbers();
		System.out.println(z.subtraction(x,y));

//
//		//测试数据的两种输入结果
//		/*	一.测试输入
//		 * 		1.第一种是调用input()方法进行输入
//		 * 		2.第二种是在构造方法中输入这个数字
//		 * 		3.第三种正确的接受千分位的数字
//		 * 		3.分别输出这两个数字
//		 * */
//		MyInteger aInteger =new MyInteger("456776543456");
//		MyInteger bInteger =new MyInteger("-12356");
//		MyInteger cInteger =new MyInteger();
//		//aInteger.input();//输入aInteger
//		System .out .print("1.输出测试:\n");
//		aInteger .output();
//		bInteger .output();
//	//	cInteger .output();
//			//Myinteger的属性测试!
//		/*
//		 * 		1.数字的长度
//		 * 		2。数字的正负（使用flag来确定，1代表数字为正，-1代表数字为负数
//		 *
//		 * */
//		System .out .println("2.a的长度："+aInteger .length+"  b的长度:"+bInteger .length  );
//		System .out .println("3.《1代表正数，-1代表负数》\n"+"a数字为："+aInteger .flag +" b数字为 "+bInteger .flag );
//		/*
//		 * MyInteger的方法测试
//		 * 		1.加法
//		 * 		2.减法
//		 * 		3.CInteger作为结果接受，并且将其输出||或者调用cInteger的output方法将其输出
//		 * 		4.
//		 */
//
//		System .out .println("4.加法结果是："+cInteger .addition(aInteger, bInteger));
//		aInteger .set("-1234567");bInteger .set("-12345");
//		System .out .println("-1234567加-12345的结果："+cInteger .addition(aInteger, bInteger));
//
//
//		System.out.println("5.减法结果是："+cInteger .subtraction(aInteger, bInteger));
//		aInteger .set("121313");
//
//		System .out .println("6.重新赋值后的Interger:"+aInteger );
//
//		System .out .println("7.aInterger和bInterger的比较:"+aInteger .equals(bInteger ));
//
//		System .out.println("8.aInterger数字转换为String后输出:"+aInteger .toString());
//
//		//测试自然数转换为同数值的Myterger
//		MyNaturalNumbers cMyNaturalNumbers =new MyNaturalNumbers("9999999");
//		MyInteger zzInteger=cMyNaturalNumbers.toMyInteger ();
//		System .out .print("9.测试输出MynarturalNumbers转换为Myinter" );
//		zzInteger.output();
//
		/*
		 * 	测试无效数据的输入
		 * 	1.千分位错误
		 */
		//aInteger .set("12,332,23");//千分位错误示例
		//cMyNaturalNumbers .set("-1213");//自然数错误示例
	}

}
