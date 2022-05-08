package Forth_JavaoopCharacter;


public class P73_Base {
       int i = 3;
        //初始化快
     
        {    System.out.println("In Base Initial block:i="+i++ );  // 
       //  +j++ 
        }
       
        P73_Base() { this(3);   System.out.println("In Base constructor:i="+i++);  //  
        System.out.println("In Base constructor :j="+j);
        }
	 	P73_Base(int j) {    this.j = j;   
        } 
	
        //j作为成员变量
        int j = 0;
         char ch='a';
        public static void main(String[] args) {
                Child c = new Child();
        }
}

class Child extends P73_Base {
       int i = 0;
        {    System.out.println("In Base Initial block:i=" + i++);  // j++; 
        
        }
        Child(){   super(9); System.out.println("In Child constructor:i=" + i+"j="+super.j);  //super();  
        
        } 
}
