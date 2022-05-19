package Five_Java_High_Level_Language_features;


class MyBox<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U> void inspect(U u) {
        System.out.print("T: " + t.getClass());
    }
}


public class Test_1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        MyBox<Integer> intergetBox = new MyBox<Integer>();
        intergetBox.add(10);
        intergetBox.inspect("some tect");
    }

}
