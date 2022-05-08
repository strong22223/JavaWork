package Five_Scores;



import java.security.AllPermission;
import java.util.*;
public class Book {
    Book(){};
    Book(String title,String publish,String ... authors){
        this.title=title;
        this.publish=publish;
        this.authors= new ArrayList<>(Arrays.asList(authors));

        inLibrary=true;
    }
    //基础属性，包括书名，作者，馆藏数量；

    Student who =null;
    int number=0;
    public boolean inLibrary=true;//判断是否在馆,状态为公开
    //重写后的equals方法，用来判断书籍是否相等，在判断书籍是否相等的时间，就去判断本质内容
     public   String title;
        public   String publish;
        ArrayList<String> authors=new ArrayList<>();

        //迭代器的使用
        private ListIterator<String> iterator=authors.listIterator();
    @Override
    public boolean equals(Object o){
        Book o1 = (Book) o;
        if(this.title.equals(o1.title)){
            if(this.publish.equals(o1.publish)){
                if(this.authors.equals(o1.authors))
                    return true;
            }
        }
        return false;
    }
    //重写String方法,方便在输出book的信息的时间将所有的东西全部输出
    @Override
    public String toString(){
        String title="书名:《"+this.title+"》";
        String publish="出版社:"+this.publish;
        String [] author = new String[authors.size()];
        authors.toArray(author);
        String a="作者:";
       for(String c:author ){
           a+=c+" ";
       }

        return  title+"\n"+publish+"\n"+a+"\n"+"inLibrary:"+this.inLibrary+'\n';

    }

    /*书籍能够提供的方法

     * */

//    private int getNumber(){没必要，在Books中设计
//        return this.number;
//    }
    //增加书籍的数量
//    public  boolean addBook(int num){
//        number+=num;
//        return true;
//    }
//    //减少书籍的数量
//    public  boolean reduBook(int num){
//        if(getNumber()-num<0)
//            return false;
//        else this.number-=num;
//        return true;
//    }
//    //返回书名
    public String getTitle(){
        return this.title;
    }
    //返回作者的信息
    public  String getAuthors(){
        iterator=authors.listIterator();
       final StringBuilder a= new StringBuilder();

         while(iterator.hasNext())
            a.append(iterator.next()+" ");
        return a.toString();
    }
    public String [] getArrayAuthors(){
         String []a= authors.toArray(new String[0]);
//        for(String b:a)
//            System.out.println(b);
        return a;
    }
    //返回出版社的信息
    public String getPublish(){
        return this.publish;
    }


}
