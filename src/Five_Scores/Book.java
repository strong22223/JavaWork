package Five_Scores;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Book {
    public boolean inLibrary = true;//?ßÿ???????,???????

    ;
    //??ß’???equals???????????ßÿ??¸û??????????ßÿ??¸û??????????????ßÿ????????
    public String title;
    //?????????????????????????????????
    public String publish;
    Student who = null;
    int number = 0;
    ArrayList<String> authors = new ArrayList<>();
    //???????????
    private ListIterator<String> iterator = authors.listIterator();
    Book() {
    }

    Book(String title, String publish, String... authors) {
        this.title = title;
        this.publish = publish;
        this.authors = new ArrayList<>(Arrays.asList(authors));

        inLibrary = true;
    }

    @Override
    public boolean equals(Object o) {
        Book o1 = (Book) o;
        if (this.title.equals(o1.title)) {
            if (this.publish.equals(o1.publish)) {
                if (this.authors.equals(o1.authors))
                    return true;
            }
        }
        return false;
    }

    //??ß’String????,?????????book?????????Åﬁ???ß÷??????????
    @Override
    public String toString() {
        String title = "????:??" + this.title + "??";
        String publish = "??????:" + this.publish;
        String[] author = new String[authors.size()];
        authors.toArray(author);
        String a = "????:";
        for (String c : author) {
            a += c + " ";
        }

        return title + "\n" + publish + "\n" + a + "\n" + "inLibrary:" + this.inLibrary + '\n';

    }

    /*?¸û??????????

     * */

    //    private int getNumber(){????????Books?????
//        return this.number;
//    }
    //?????¸û??????
//    public  boolean addBook(int num){
//        number+=num;
//        return true;
//    }
//    //?????¸û??????
//    public  boolean reduBook(int num){
//        if(getNumber()-num<0)
//            return false;
//        else this.number-=num;
//        return true;
//    }
//    //????????
    public String getTitle() {
        return this.title;
    }

    //????????????
    public String getAuthors() {
        iterator = authors.listIterator();
        final StringBuilder a = new StringBuilder();

        while (iterator.hasNext())
            a.append(iterator.next() + " ");
        return a.toString();
    }

    public String[] getArrayAuthors() {
        String[] a = authors.toArray(new String[0]);
//        for(String b:a)
//            System.out.println(b);
        return a;
    }

    //?????????????
    public String getPublish() {
        return this.publish;
    }


}
