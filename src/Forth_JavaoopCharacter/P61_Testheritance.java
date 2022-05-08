package Forth_JavaoopCharacter;

public class P61_Testheritance {
 	public static void main(String[] args){
			Rectangle rect=new Rectangle();
			rect.newDraw();
		}
	}
	class Shape{
		private void draw(){ System.out.println("Draw shape"); }
	}
	class Rectangle extends Shape{
		public void draw(){ System.out.println("Draw Rectangle"); }
		public void newDraw(){
			draw();
			//super.draw();
		}
	}