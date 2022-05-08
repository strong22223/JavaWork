package Forth_JavaoopCharacter;

import java.net.http.HttpResponse.BodySubscriber;

import three_LanguaheBasic.C;

public class P42_ProtectedVsPackageAndPublic {

		public static void main(String[] args){
//			C obj=new C();
//			// obj.func();	//不是C的子类，且与C非同一个包
//	         obj = new CSub(); ((CSub)obj).func();
	         CSub sub= new CSub();
	         sub.mtd();
	        // sub.func();
	         //((CSub)obj).mtd(obj, (CSub)obj);   // obj.mtd(obj, obj);
			//obj.mtd(obj, obj);
			//CSub bCSub= new CSub();
			//bCSub .mtd(obj, bCSub);
			//bCSub .c();
		}
	}
	class CSub extends C{		
		//C的子类，可以访问C的func()方法
		 
		private void c() {
			System .out .println("可以");
		}
		void mtd(){
			C obj=new C();
			// obj.func();	//不是C的子类，且与C非同一个包
	         obj = new CSub(); ((CSub)obj).func();
			func();
			 //parent.func();      //不是C的子类，且与C非同一个包
			//sub.func();
		c();
		}
	}
	

