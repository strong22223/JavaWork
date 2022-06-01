package Ten_Thread.Producer_Consumer;

import java.util.ArrayList;

public class SyncStack {
    private ArrayList<Character> List = new ArrayList<>();
    //Ϊ�˱�֤�������ݵ�һ����,push()��pop()��������ʹ��Synchronized������
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
