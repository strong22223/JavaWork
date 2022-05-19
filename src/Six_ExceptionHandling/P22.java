package Six_ExceptionHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

class ListOfNumbers {
    private final static int SIZE = 10;
    private ArrayList<Integer> list;//=new ArrayList<>(SIZE);

    public void ListOfNumbers() {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE + 10; i++)
            list.add(i);
    }

    //��list���浽OutFile.txt�ļ���
    public void writeList() {
        System.out.println("Entering Tyr statement:");
        PrintWriter out = null;
        try {

            out = new PrintWriter(new FileWriter("OutFile.txt"));

            for (int i = 0; i < SIZE + 10; i++) out.println("Value at:" + i + "=" + list.get(i));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught  ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Catch IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }
}

public class P22 {

    public static void main(String[] args) {
        ListOfNumbers list = new ListOfNumbers();
        list.writeList();

    }
}
