package Five_Java_High_Level_Language_features;

abstract interface P53_Printable1 {
    void print();
}

abstract interface P53_Printable2 {
    int a = 1;

    void print();
}

abstract interface Printable extends P53_Printable1, P53_Printable2 {
    int a = 9;

    void print();
}
//public class a implements Printable{
//    int a;
//   public void print(){
//       System.out.println(a);
//   }
//
//
//}
