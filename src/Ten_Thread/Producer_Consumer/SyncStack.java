package Ten_Thread.Producer_Consumer;

import java.util.ArrayList;

public class SyncStack {
    private ArrayList<Character> List = new ArrayList<>();
    //为了保证共享数据的一致性,push()和pop()方法必须使用Synchronized来修饰
    public synchronized char pop(){
        char c;

        while(List.isEmpty()){
            try{
                this.wait();

            }catch ( InterruptedException e){
                System.err.println(e.getStackTrace());
            }

        }
        c=List.get(List.size()-1);
        return c;
    }

    @Override
    public String toString() {
        return "SyncStack{" +
                "List=" + List +
                '}';
    }

    public synchronized void push(char c){
        this.notify();
        List.add(c);
    }
}
