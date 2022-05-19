package Five_Scores;

import java.util.ArrayList;

public class Student {
    //?????üž?????????
    private static final int MAXNUMBER = 3;
    public String name = null;
    public ArrayList<Book> borrowed = new ArrayList<>(MAXNUMBER);
    private String studentCode = null;
    Student(String name, String code) {
        this.name = name;
        this.studentCode = code;
    }

    //????
}
