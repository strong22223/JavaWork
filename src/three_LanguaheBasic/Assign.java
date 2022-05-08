package three_LanguaheBasic;

public class  Assign {
	int x,y;
	public static void main(String args[]) {
					// 声明整型变量
		Assign assign=new Assign();
	
		float z = 3.414f; 		// 声明并赋值float型变量
		double w = 3.1415; 	// 声明并赋值double型变量
		//	System .out .print("x="+x+"y="+y+"z="+z+"w="+w);
		boolean truth = true; 	// 声明并赋值boolean型变量
		char c; 			// 声明字符变量
		String str; 		// 声明String类型变量
		String str1 = "bye";	// 声明并赋值String类型变量
		//	x = 6;
		//	y = 1000; 		// 给int型变量赋值
		//System .out .print("x="+x+" y="+y+" z="+z+" w="+w);
		c = 'A'; 			// 给字符变量赋值
	//	System .out .print("str="+str+" str1="+str1);
		str = "Hi out there"; 	// 给String变量赋值	
		System.out .print("x="+assign.x +" y="+assign .y+" str="+str+" str1="+str1);
		System .out.println();
		System .out .println(12.3+"\n"+12.3e+2+"\n"+23.4e-2+"\r"+-334.4+"\n"+20+"\n"+39F+"\n"+40D);
		System .out .println("除了20不是浮点数其他都是！");
		
		System .out.println(0.0==-0.0);
		System .out.println(0.0>-0.0);
		System .out.println("======================\n"+(1.0>Double .NaN ));
		System .out.println(1.0<Double .NaN );
		System .out.println(1.0==Double .NaN );
		System .out.println(1.0!=Double .NaN );
		System .out.println(Double .NaN ==Double .NaN );
		System .out.println(0.0/0.0);//NAN非数
		System .out.println(1.0/0.0);//无限
		System .out.println(1.0/-0.0);
		System .out.println((1.0/-0.0)*0);//非数NAN

		
		
	}
}
 