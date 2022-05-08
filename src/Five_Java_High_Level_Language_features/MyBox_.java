package Five_Java_High_Level_Language_features;

import java.util.*;

//
//public class Test {
//	 int i=0;
//	 public int add( int a,int b){
//		 System.out.println("计算两个数字的和：");
//		 return a+b;
//	 }
//	public static void main(String[] args) {
//		 Test c=new Test();
//		 c.add(2,3);
//	}
//}
public class MyBox_{
	private Object object;
	public void add(Object object){
		this. object=object;
	}
	public Object get(){
		return object;
	}
//	ArrayList<String> x= new ArrayList<String>( );
	public static void main(String []args){
/*
	测试在泛型中，即使类型参数是有父子类的关系，但是对应的泛型是没有父子类关系的！
	即所谓的父类的泛型是不能够指向子类的泛型类型！
 */
//		List<String> ls= new ArrayList<String>();
//		List<Object> lo=ls;
	//	lo.add(new Object());
//		Collection<String>
//		MyBos<String> x=new MyBos<String>();
//		x.add("das");
//		x.add("aaa");
//		System.out.println(x.get());
//		x.add("xxx");
		Set<String> s= new HashSet<String>();
		for(String a :args){
			if(!s.add(a)){
				System.out.println( "Duplicate detected:"+a);
			}
		}
		System.out.println(s.size()+"distinct words detected: "+s);
	}
}

class MyBos<c>{
	private c t;
	public void add(c t){
		this .t=t;
	}
	public c get(){
		return t;
	}
}

