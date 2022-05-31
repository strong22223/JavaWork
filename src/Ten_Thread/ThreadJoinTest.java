//package Ten_Thread;
//
//public class ThreadJoinTest {
//    public static void main(String[] args) throws Exception{
//        int i=0;
//        Hello t=new Hello();
//        t.start();
//        System.out.println("-----------------------");
//        t.setPriority(Thread.MAX_PRIORITY);
//        while(true){
//            System.out.println("Good Morning"+i++);
//            if(i==2&&t.isAlive()){
//                System.out.println("Main waiting for Hello:");
//                t.join();
//             }
//            if(i==5)break;
//        }
//    }
//}
//
//class  classHello extends Thread{
//    int i=0;
//    boolean timeQuit=false;
//    @Override
//    public void run() {
//        while(!timeQuit){
//            System.out.println("Hello "+i++);
//            if(i==5)timeQuit=true;
//        }
//     }
// }
