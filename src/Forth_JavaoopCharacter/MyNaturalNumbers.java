package Forth_JavaoopCharacter;

public class MyNaturalNumbers extends MyInteger {
	//长度,
	 
	final int flag=1;//来保证自然数的符号位不会 发生变化
	public MyNaturalNumbers () {
	}
	public MyNaturalNumbers (String a) {
		input(a);
	}
	public boolean input(String iString) {
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
	@Override 
		public boolean set(String l) {
		//成功额时间返回true
		if(this.input(l))
			return true;
		return false;
	}
	 //判断是否为一个数字
	private boolean isdigit(String lString ){
		//存储的时间倒着存储。方便计算
		
		 for(int i=lString .length()-1,k=0;i>=0;i--) {
			 //判断是否为数字
			 int temp=0;//来记录‘，’出现的次数
			 char ch=lString .charAt(i);
			 if(Character .isDigit(ch)||ch==','){//一个数字由这些部分组成
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
	//实现
	public MyInteger toMyInteger () {
		if(this.flag ==-1)
			//return false;
			System .out .print("异常！");
		MyInteger a=new MyInteger();
		a.longIntegers =this.longIntegers ;
		a.length =this.length ;
		a.flag=1;
		return a ;
	}
	  
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
		MyNaturalNumbers cMyNaturalNumbers=new MyNaturalNumbers("-2324");
		
	}

}
