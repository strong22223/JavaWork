package HomeWork;

class Child extends BaseHOme {

    public void func1() {
        System.out.println("Child func1 print.");
    }

    public void func2() {
        System.out.println("Child func2 print.");
    }

}

public class BaseHOme {

    public static void main(String args[]) {

        BaseHOme b = new Child();

        b.func1();

        b.func2();

        ((Child) b).func1();

        ((Child) b).func2();

    }

    private void func1() {
        System.out.println("Base func1 print.");
    }

    public void func2() {
        System.out.println("Base func2 print.");
    }

}