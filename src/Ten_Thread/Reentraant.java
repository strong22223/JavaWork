package Ten_Thread;


//对象锁的课冲入性,在一个对象获得这个所得时间,他可以重复的获得这个锁,他的方法可以重复获得这个锁来获取方法
public class Reentraant {
    public synchronized void a(){
        b();
        System.out.println("Here I am in a()");
    }
    public synchronized void b(){
        System.out.println("Here I am in b()");
    }

    public static void main(String[] args) {
        new Reentraant().a();
    }
}
