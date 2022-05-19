package Six_ExceptionHandling;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

class ListOfNumbersDeclared {
    private static final int size = 10;
    private ArrayList<Integer> list;

    public ListOfNumbersDeclared() {//���췽��
        list = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++)
            list.add(i);
    }

    public void writeList()
            throws IOException, IndexOutOfBoundsException {//�����׳��쳣
        PrintWriter out = new PrintWriter(new FileWriter("OutFile1.txt"));
        for (int i = 0; i < size; i++)
            out.println("Value at: " + i + " = " + list.get(i));
        out.close();
    }
}

public class P25_TestListOfNumbersDeclared {
    public static void main(String args[]) {
        try {
            ListOfNumbersDeclared list = new ListOfNumbersDeclared();
            list.writeList();
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        System.out.println("A list of numbers created and stored in OutFile1.txt");
    }
}
