package Five_Scores;


import java.util.*;

public class Books {

    Books(String title,String publish,String ... authors){
        this.a.title=title;
        this.a.publish=publish;
        this.a.authors= new ArrayList<>(Arrays.asList(authors));
        this.a.number++;
        books.add(a);
        this.number=books.size();
    }
    //Books是相同书籍的存储器，用来表示一种书籍不同本的各种状态，而这个种状态之间值是互通的
     ArrayList<Book> books=new ArrayList<>();
    ListIterator<Book> booksIterator=books.listIterator();
    int number=books.size() ;//同一个书籍的本数
    Book a=new Book();//创建的这个书籍的样例，用于在日后添加该书籍的时间判断是否相等
    // 返回书籍,用于在添加或者减少书籍的时间做判断是否是同一本书籍

    /*
    重写books的TOString方法，保障在输出这个书籍的时间，将他的书籍信息和馆藏数全部输出
    如果再想要去查询书籍的时间查询到的是每一个具体的书籍的状态，将此方法改写
     */
    @Override
    public String toString(){
        Book temp=this.getBook();
        StringBuilder a= new StringBuilder();
        String title=temp.getTitle();
        String publish=temp.getPublish();
        String  authors= temp.getAuthors();

        return "书名:《"+title+"》\n出版社:"+publish+"\n作者:" +authors+"\n馆藏数:"+this.number;
    }
    public Book getBook(){
        return books.get(0);
    }
    public  boolean addBook(Book n,int m){
        while(m--!=0)
        books.add(n);
        number=books.size();
        return true;
    }
    public boolean reduBook(Book n,int m){
        booksIterator=books.listIterator();
        while(booksIterator.hasNext()&&m!=0){
            if(booksIterator.next().inLibrary){
                booksIterator.remove();m--;//减少书籍，在书籍在馆的时间时间将他减少
            }else{ }
        }
        this.number=books.size();//将其长度
        if(m!=0){System.out.println("剩余"+m+"个没有移除，已被借出！");return false;}
        return true ;
    }
    //得到书名
    public String getTitle(){
        return books.get(0).getTitle();
    }
    //得到作者名
    public String getPublish(){
        return books.get(0).getPublish();
    }
    //得到作者名
    public String getAuthors(){
        return books.get(0).getAuthors();
    }
    public String []getArrayAuthors(){
        return books.get(0).getArrayAuthors();
    }
//    public static void main(String args[]){
//        Books one=new Books("老人与海","北京","王五","李华");
//        System.out.println(one.books);
//    }
}
