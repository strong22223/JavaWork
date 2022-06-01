package Ten_Thread.Producer_Consumer;

public class Test {
    public static void main(String[] args) {

        SyncStack stack=new SyncStack();

        Producer pro1= new Producer(stack);

        Consumer con1 = new Consumer(stack);

        new Thread(pro1).start();
        new Thread(con1).start();
        try{
            Thread.sleep(2000);
        }catch(Exception e){

        }
        System.out.println(stack);
    }
}
