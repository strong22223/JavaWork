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

    //��������ӵ�Ӱ Ʊ����Ϣ
    private void addFilm() throws IOException {
        String s;
        while ((s = reader.readLine()) != null) {
            ticket.add(s);
        }
    }
    //˳�����
    public synchronized void  sellTicket() throws filmException{
        if(!listIterator.hasNext()){
            throw new filmException("��ӰƱ�ۿ�");
        }else{
            System.out.println();

        }
    }
    //��ʾ�����е��鼮
    public synchronized  void allTickets(){
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }

}
