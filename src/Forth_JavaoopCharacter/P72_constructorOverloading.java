package Forth_JavaoopCharacter;

public class P72_constructorOverloading {

	 
		public static void main(String[] args){
			Student stu=new Student();
			System.out.println(stu.getName()+", "+stu.getID());
		}
	}
	class Student{
		private String name;
		private String id;
		public Student(String nm, String id){
		
			this.name=nm;
			this.id=id;
		}
		public Student(String nm){
			//String string="as";在构造方法中调用另外一个构造方法的时间，必须使用this，比关切放在首行！！
			this(nm,"00000000");
		}
		public Student(){
			//int a;
			this("Unknown");
		}
		public String getName(){ return name; }
		public String getID(){ return id; }
	}

