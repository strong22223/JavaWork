package Seven_InputOutput;

import java.io.*;

public class P33_BufferedIO {

    public static void main(String[] args) throws IOException {
        File a = new File("D:\\WorkDoxc\\xd_javawork\\src\\Seven_InputOutput\\P33_BufferedIO.java");
        File b = new File("D:\\WorkDoxc\\xd_javawork\\src\\Seven_InputOutput\\P33.txt");
        System.out.println(b.exists());
        BufferedReader in = new BufferedReader(
                new FileReader(a));
        PrintWriter out = new PrintWriter(new BufferedWriter(
                new FileWriter(b)));
        String s;
        int linecnt = 1;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null) {
            sb.append(linecnt + ":" + s + "\n");
            out.println(linecnt + ":" + s);
            linecnt++;
        }
        in.close();
        out.close();
        System.out.print(sb.toString());
    }
}
