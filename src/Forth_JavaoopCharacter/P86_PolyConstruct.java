package Forth_JavaoopCharacter;

class Glyph {
	
	void draw() {String string="∏∏¿‡"; System.out.println("Glyph.draw()"+string); }
	Glyph() {
		
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}
class RoundGlyph extends Glyph {
	public int radius = 1;
	
	RoundGlyph(int r) {
		radius = r;
		System.out.println("RG.RoundGlyph(), radius = " + radius);
	}
	void draw() {   String string="◊”¿‡";System.out.println("RG.draw(), radius = " + radius+string); }
}
public class P86_PolyConstruct {
	public static void main(String[] args) {
		new RoundGlyph(5);
		new Glyph();
		Glyph aGlyph=new RoundGlyph (2);
	}
}
