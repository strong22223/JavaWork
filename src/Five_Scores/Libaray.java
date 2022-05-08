package Five_Scores;

import java.util.*;

public class Libaray {
     /*图书馆中提供的功能
        1.图书馆提供书籍存储
        2.添加书籍
        3.查阅书籍
        4.删除书籍
        5.图书馆类需要对外提供所有书籍的名称，所有书籍对应的作者、出版社
     */
    //将书籍对应的编号作为书籍的唯一标识，使用Map来存储书籍，引入Book类，和每一个书籍对应的编号，从1开始，也可以设置为ISBN码
    Libaray(){
    }
    HashMap<String,Books> machine=new HashMap<String, Books>();
     private int ISBN=0;
//
//    //借阅书籍的最大数量,还为完成借阅功能
//    private final static int  MAXNUMBER=3;
    //存储书籍的迭代器，通过键来访问到书籍的信息  //ISBN编号的迭代器，获取键，通过键获取书籍的信息
    private  Iterator<String> AllISBNIt=machine.keySet().iterator();
  //AllBook是所有值得信息，也就是所有馆藏的书籍的信息
    public Collection ALLBook=machine.entrySet();

    //对图书的添加
    public boolean addBook(Books v,Integer n){
        //在添加的时间必须重新指向这里。
        AllISBNIt=machine.keySet().iterator();
        Book m=v.getBook();
        while(AllISBNIt.hasNext()){
            String key=AllISBNIt.next();
            if(machine.get(key).getBook().equals(m)){
                machine.get(key).addBook(m,n);
                return true;
            }
        }
        //没有相同的书籍，则讲这个书籍不再进行放入,只是去增加书籍的个数，并不是去添加书籍！

        return true;
    }
    public boolean reduceBook(Books v,int n){
        //在添加的时间必须重新指向这里。
        AllISBNIt=machine.keySet().iterator();
        Book m=v.getBook();
        while(AllISBNIt.hasNext()){
            String key=AllISBNIt.next();
            if(machine.get(key).getBook().equals(m)){
//                if(machine.get(key).number<=n){
////                    AllISBNIt.remove();//直接移除添加书籍的种类，全部删除
//                }else
                machine.get(key).reduBook(m,n);//如果删除的不够多的时间将，书籍没有被借出的删除
                return true;
            }
        }
        return false;//没有此书
    }
    //图书馆的书籍信息的查询
    public boolean findBasedTitle(String title){
        //在添加的时间必须重新指向这里。
        AllISBNIt=machine.keySet().iterator();
        boolean exited=false;
        while(AllISBNIt.hasNext()){
            String key=AllISBNIt.next();
            if(machine.get(key).getTitle().equals(title)){
                System.out.println(machine.get(key));
                exited=true;
            }
        }
        //没有找见的时间返回false
        if(exited)return true;
        System.out.println("NULL");
        return false;
    }
    //查询书籍依照
    public boolean findBasedPublish(String  publish){
        //在添加的时间必须重新指向这里。
        AllISBNIt=machine.keySet().iterator();
        boolean exited=false;
        while(AllISBNIt.hasNext()){
            String key=AllISBNIt.next();

            if(machine.get(key).getPublish().equals(publish)){
                System.out.println(machine.get(key));
                exited=true;
            }
        }
        //没有找见的时间返回false
        if(exited) return true;  System.out.println("NULL");
        return false;
    }
    //查询书籍依照作者，
    public boolean findBasedAuthor(String author){
        //在添加的时间必须重新指向这里。
        AllISBNIt=machine.keySet().iterator();
        boolean exited=false;
        while(AllISBNIt.hasNext()){
            String key=AllISBNIt.next();
            String [] a=machine.get(key).getArrayAuthors();
             for(String c:a){
                 if(c.equals(author)) {
                     System.out.println(machine.get(key)); exited=true;
                 break;
                 }
             }
        }
        //没有找见的时间返回false
        if(exited) return true;  System.out.println("NULL");
        return false;
    }
//    //图书借阅功能
//    public
}
