package three_LanguaheBasic;

public class CharConst {
//类名和接口名 第一个大写，区域全部小写
//变量名和方法，首单词小写其余单词的首字母大写
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1='Q';
// =================Unicode编码的三种实现方法
		char c2='\u0051';//四位十六进制
		char c3=0x0051;//十六进制
		char c4='\121';//三位八进制
 
		System .out .println("c1:"+c1+" c2:"+c2+" c3:"+c3+" c4:"+c4);
		//转义字符
		//+将字符串连接起来，如果是字符的话就会自动转换为int
		System.out.println('\''+"+"+'\\');
		System.out.println('\''+'\\');
		//\r与\n
		System.out.print("AAAAAA"+'\r');
		System.out.print("分割线==============");
		System .out .print('\r');
		System.out.print("AAAAAA"+'\n');
		System.out.println("分割线==============");
		
		System.out.println("=======================");
		
		System.out.print("AAAAAA\n\r");
		System.out.print("分割线==============");
		System .out .print('\r');
		System.out.print("AAAAAA\r\n");
		System.out.println("分割线==============");
		 
		System.out.print("123\b4567\b89\b");


		System.out.println("\taaaa");
		System.out.println((int)c1);
		System.out.println(c1+' ');
	}

}
