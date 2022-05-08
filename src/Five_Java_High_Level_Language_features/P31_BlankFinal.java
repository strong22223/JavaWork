package Five_Java_High_Level_Language_features;

class Poppet {
    private int i;
    Poppet(int ii) { i = ii; }
}
public class P31_BlankFinal {
    private final int i = 0; 	// 被初始化的final
    private final int j; 	// 空白final
    private final Poppet p; 	// 空白final引用
    public P31_BlankFinal() {
        Poppet p1;
        j = 1; 			// 初始化空白final
        p = new Poppet(1); 	// 初始化空白final引用
//      p=new Poppet(3);
    }
    public P31_BlankFinal(int x) {
        j = x; 			// 初始化空白final
        p = new Poppet(x); 	// 初始化空白final引用
    }
    public static void main(String[] args) {
//        new P31_BlankFinal();
//        new P31_BlankFinal(47);






    }
}		// 又例：Customer.java
