package Six_Scores;
import Six_Scores.DateException;

import java.util.LinkedList;
import java.util.Scanner;

public class Date {

	LinkedList <Integer> longIntegers=new LinkedList<Integer>();
	Scanner inScanner=new Scanner(System .in);
	int flag=1;//符号位
	public int length;//存储数字的长度
	private Date (String lString ) throws DateException{
		length=longIntegers .size();
	}

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
	//判断是否为一个数字
	static Date getInstance(String lString ) throws DateException {
		final Date num=new Date(lString);
		//存储的时间倒着存储。方便计算
		for(int i=lString .length()-1,k=0;i>=0;i--) {
			//判断是否为数字
			int temp=0;//来记录‘，’出现的次数
			char ch=lString .charAt(i);
			if(Character .isDigit(ch)||ch==','||ch=='-'){//一个数字由这些部分组成
				if(ch==',') {
					temp++;
					if((temp+k)%3!=1)
						throw new DateException("千分号格式输入错误！");
				}
				if(ch=='-') {
					if(i!=0)
						throw new DateException("输入格式错误！");
				}
			}
			else { throw new DateException("输入格式错误！");}
			if(ch!=',')k++;//忽略‘，’的影响
		}
		if(lString .charAt(0)=='-')
			num.flag=-1;//标记这个数字位负数
		//存入数字
		for(int i=lString .length()-1,k=0;i>=0;i--) {
			char ch=lString .charAt(i);
			if((Character .isDigit(ch))) {
				num	.longIntegers .add(k,0);
				num.longIntegers .set(k,  ch-'0');
				k++;//记得，大无语
			}
		}
		return num;
	}


}
