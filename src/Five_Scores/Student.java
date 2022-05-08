package Five_Scores;

import java.util.ArrayList;

public class Student {
    Student(String name,String code){
        this.name=name;
        this.studentCode=code;
    }
    private String studentCode=null;
    public String name=null;

    //借阅书籍的最大数量
    private static final  int  MAXNUMBER=3;
    public ArrayList<Book> borrowed=new ArrayList<>(MAXNUMBER);

    //借书
}
