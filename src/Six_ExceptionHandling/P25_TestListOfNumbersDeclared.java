package Six_ExceptionHandling;


import java.io.*;
import java.util.*;

class ListOfNumbersDeclared {
    private ArrayList<Integer> list;
    private static final int size = 10;
    public ListOfNumbersDeclared() {//构造方法
        list = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++)
            list.add(i);    }
    public void writeList()
            throws IOException, IndexOutOfBoundsException {//声明抛出异常
        PrintWriter out = new PrintWriter(new FileWriter("OutFile1.txt"));
        for (int i = 0; i < size; i++)
            out.println("Value at: " + i + " = " + list.get(i));
        out.close();    }
}
public class P25_TestListOfNumbersDeclared {
    public static void main(String args[]) {
        try { ListOfNumbersDeclared list = new ListOfNumbersDeclared();
            list.writeList();
        } catch (Exception e) { System.out.println("ERROR");}
        System.out.println("A list of numbers created and stored in OutFile1.txt");
    }
}
