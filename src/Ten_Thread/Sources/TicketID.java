package Ten_Thread.Sources;

import java.io.*;
import java.util.ArrayList;
import java.util.ListIterator;

public class TicketID {
    private ArrayList<String> ticket = new ArrayList<>();
    private BufferedReader reader;
    private ListIterator<String> listIterator=ticket.listIterator();

    public TicketID(File file) throws IOException {
        this.reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "gbk"));
        this.addFilm();
    }

    //首先来添加电影 票的信息
    private void addFilm() throws IOException {
        String s;
        while ((s = reader.readLine()) != null) {
            ticket.add(s);
        }
    }
    //顺序出售
    public synchronized void  sellTicket() throws filmException{
        if(!listIterator.hasNext()){
            throw new filmException("电影票售空");
        }else{
            System.out.println();

        }
    }
    //显示出所有的书籍
    public synchronized  void allTickets(){
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }

}
