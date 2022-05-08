package Forth_JavaoopCharacter;

import java.util.LinkedList;
import java.util.Scanner;

 
 
public class MyInteger {
	
	LinkedList <Integer> longIntegers=new LinkedList<Integer>();
	Scanner inScanner=new Scanner(System .in);
	int flag=1;//符号位
	public int length;//存储数字的长度
	//函数类
	fun f=new fun();//调用的方法类
	
	
	
	
	public MyInteger () {
		 length=longIntegers .size();
	}
	public MyInteger (String lString ) {
		 
		 length=longIntegers .size();
		 input (lString );
	}
	//构造方法来初始化长度Length
 
	
	//重写toString方法
	@Override
	public String toString() {
		String  c = "";
		 String b="";
		 for(int i=longIntegers .size() -1;i>=0;i--) {
			 c = b+longIntegers .get(i);
			 b=c;
		 }
		 if(this.flag ==-1)
		return "-"+c ;
		 return c;
	}
	

	//重写equals
	public String equals(MyInteger   a) {
		 
		int i=0;
		MyInteger c=(MyInteger)a;
		int flag=0;
		if(this.length >c .length) {
			 flag=1;
		}
		else if (this.length ==c.length ){	
				
				while(i<this.length ) {
					if( this.longIntegers.get(i)>c.longIntegers .get(i)) {
						flag=1;break;
					}
					else if(this.longIntegers.get(i)<c.longIntegers .get(i)) {
						flag=-1;
						break;
					} else flag=0;
				}
				
			}
		else
				flag=-1;
		
		switch(flag) {
		case 1:return "大于";
		case -1:return "小于";
		case 0: return "等于";
		
		}
		return "ERROR";
	}
	
	//判断是否为一个数字
	private boolean isdigit(String lString ) {
		//存储的时间倒着存储。方便计算
		 for(int i=lString .length()-1,k=0;i>=0;i--) {
			 //判断是否为数字
			 int temp=0;//来记录‘，’出现的次数
			 char ch=lString .charAt(i);
			 if(Character .isDigit(ch)||ch==','||ch=='-'){//一个数字由这些部分组成
				 if(ch==',') {
					 temp++;
				 if((temp+k)%3!=1)
					 return false;
				 }
				 if(ch=='-') {
					 if(i!=0)
						  return false;
				 }
			 }
			 else { return false;} 
			 if(ch!=',')k++;//忽略‘，’的影响
		 }
		 if(lString .charAt(0)=='-')
			 this.flag=-1;//标记这个数字位负数
		 //存入数字
		 for(int i=lString .length()-1,k=0;i>=0;i--) {
			 char ch=lString .charAt(i);
			 if((Character .isDigit(ch))) {
				 longIntegers .add(k,0);
				 longIntegers .set(k,  ch-'0');
				 k++;//记得，大无语
			 }
		 }
		return true;
	}
	//设置
	public boolean set(String l) {
		//成功额时间返回true
		if(this.input(l))
			return true;
		return false;
		
	}
	//输入这个数字
	protected boolean  input() {
		System .out .println("请输入长整数：");
		String iString  =inScanner  .nextLine();
		this.longIntegers .clear();
		 while(!isdigit(iString)) {
			 System.out.println("输入错误，是否需要重新输入？Yes/No");
			iString = inScanner .nextLine();
			 if(iString  .equals("Yes")) {
				 iString=inScanner  .nextLine();	 
			 } else { System .out .println("结束");return false;}
		 }
		 //重置长度
		  length=longIntegers .size();
		 return true;
	}
	protected boolean input(String iString ) {
		this.longIntegers .clear();
		 while(!isdigit(iString)) {
			 System.out.println("输入错误，是否需要重新输入？Yes/No");
			iString = inScanner .nextLine();
			 if(iString  .equals("Yes")) {
				 iString=inScanner  .nextLine();	 
			 } else { System .out .println("结束");return false;}
		 }
		 //重置长度
		  length=longIntegers .size();
		 return true;

	}
	//输出一个数字
	public void output() {  
		System .out .println(this .toString());
	}

	//方法
	class fun{
		//swap
		private boolean  swap(MyInteger A,MyInteger B) {
			//调用外包类的成员,实现交换返回真
			//MyInteger .this.longIntegers .clear();
			if (A .equals(B).equals("小于") ) {//实现交换。
				MyInteger t=new MyInteger() ;
				t.longIntegers =A.longIntegers ;t.length =A.length ;t.flag =A.flag ;
				A.longIntegers =B.longIntegers ;A.length =B.length ;A.flag=B.flag ;
				B.longIntegers=t.longIntegers ;B.length =t.length ;B.flag =t.flag ;
			return true;	
			}
			return false;
		}
		//加法
		private MyInteger add(MyInteger aInter,MyInteger bInter){
			//为了解决在交换的时间将原始数据交换，采用kelong
			MyInteger A=aInter;
			MyInteger B=bInter;
			//交换确定基准,
			MyInteger .this.longIntegers .clear();
			boolean swaped=(f.swap(A, B));
				
		
			int Alen=A.length-1 ;//确定长度，直接确定计算的位置
			int Blen=B.length-1;
			//以最短的作为一个标准
			int i=0, a=0;
			while(i<=Alen) {
				
				MyInteger.this.longIntegers .add(i,0);
				if(i<=Blen) 
					a=A.longIntegers.get(i)+B.longIntegers.get(i)+a;
				else
					a=A.longIntegers.get(i);
				
				MyInteger .this.longIntegers .set(i,(a%10));
				a/=10;
				//System .out.println("加和为"+resultIntegers .get(i));
				//只有在位数小的数字变为0的时间采去减法
				i++;
			}
			if(swaped)f.swap(B, A);
			return MyInteger .this;
		}
		//减法
		private MyInteger sub(MyInteger aInter,MyInteger bInter) {
			//交换来确定基准
			MyInteger A=aInter ;
			MyInteger B=bInter ;
			MyInteger .this.longIntegers .clear();
			 boolean swaped =f.swap(A , B);
			
			int  Alen=A .length-1 ;//确定长度，直接确定计算的位置
			int Blen=B .length-1;
		 
			 
				//以最短的作为一个标准
			int i=0,min=0,sub=0,next=0;
			while(i<=Alen ) { 
				//位数的确定
				if(i!=Alen ||A.longIntegers .get(i)!=0) {
					longIntegers .add(i,0);
					min=A .longIntegers .get(i);
					if(i<=Blen )
					sub=B .longIntegers .get(i);
					if(i<Alen )
					next=A .longIntegers .get(i+1); 
					
					if(i<=Blen) {
					
						 if(min<sub) {
							 min+=10;//结位相减
							 A.longIntegers .set(i+1,  next-1); 
							 longIntegers .set(i,  min-sub );
						 }	
						 else MyInteger .this .longIntegers .set(i, min-sub);		 
					}
					else MyInteger .this.longIntegers  .set(i, min);
				//解决不断向结尾的空缺
					}
					i++;
			} 
		if(swaped)	f.swap(B , A);//交换回来
			return MyInteger .this;
		}
		
	}
	public MyInteger addition(MyInteger A,MyInteger B) {
		//重置,在输出之后退出！！！已经交换过，要不会重复执行
		//在作为资格接受结果的时间
		if(A.flag ==1&&B.flag ==1) {
			f.add(A, B);	 
			//this.output(); 
			return this;
		}
		 if(A.flag==-1&&B.flag ==-1) {
			f.add(A, B);
			this.flag =-1;
//			this.output(); 
			return this;
		}
		if (A.flag==-1&&B.flag==1)
		{
			if(A.equals(B).equals("大于")) {
				f.sub(A, B);
				this.flag=-1;
			}else 
				f.sub(A, B);
			
//			this.output(); 
			return this;
		}
		if(A.flag ==1&&B.flag ==-1) {
			if(A.equals(B).equals("小于")){
				f.sub(A, B);
				this.flag =-1;
			}else 	
				f.sub(A, B);
			
//			this.output(); 
			return this;
		}
			
//		this.output(); 
		return this;
	}
	 
	//减法,前者减去后者
 
	public MyInteger subtraction(MyInteger A,MyInteger B) {
		//大的数字是A,可选择的在作为结果直接输出
		 
		if(A.flag ==-1&&B.flag==1) {
			f.add(A, B);
			this.flag =-1;
	//		this.output(); 
			return this;
		} 
		if(A.flag==-1&&B.flag==-1) {
			if(A.equals(B).equals("大于")) {
				f.sub(A, B);
				this.flag =-1;
			} 
			else
				f.sub(A, B);
			
		//	this.output(); 
			return this;
		}
		 if(A.flag ==1&&B.flag ==1) {
			if(A.equals(B).equals("小于")) {
				f.sub(A, B);
				this.flag =-1;
			} else 
				f.sub(A, B);
			
			//this.output(); 
			return this;
		}
		 if(A.flag ==1&&B.flag==-1) {
			f.add(A, B);
			//this.output(); 
			return this;
		}
		//this.output(); 
		return this;
	}
	//未完成乘法
	public   MyInteger     multiplication(MyInteger A,MyInteger B) {
		int Alen=A.length-1 ;//确定长度，直接确定计算的位置
		int Blen=B.length-1;
 
		if (Alen>Blen ) {//实现交换。
			int temp=Alen ;Alen =Blen ;Blen =temp;
			MyInteger tInteger=A;A=B;B=tInteger;
		}
		//以最短的作为一个标准
		int a=0;
		for(int i=0;i<=Alen ;i++) {
			for(int j=0;j<=Blen ;j++) {
				a=A.longIntegers  .get(i)*B.longIntegers .get(j)+a; 
			//	if()
				longIntegers .add(i,0);	
				longIntegers .set(i,(a%10));
			 a/=10;
			} 
		}
			
		this.output(); 
		return this;
	}
	 
	

}
