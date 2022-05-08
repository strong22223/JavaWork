package Five_Scores;

import java.rmi.MarshalledObject;

public class UI {
    public static void main(String []args){
/*
        1.整体图书馆的构架分为在初始开始的我时间去添加书籍的种类，在添加玩书籍的种类之后方便管理，在可以添加当前种类书籍的具体书籍。
        前面对应的数一种书籍的馆藏码，作为每种书籍的唯一标识。
        2.添加书籍，
        3.删除书籍
        4.查阅书籍


 */
        Libaray c= new Libaray();
        Books oldMan=new Books("老人与海","西电出版社","王五","李华");
        Books mouse=new Books("米老鼠","北大出版社","李四","老六");
        Books zhangSan=new Books("张三的生活","西安出版社","王五","李华");
        //放入书籍，将书籍的信息放入,前面的编号相当于一种书的馆藏码
        c.machine.put( "1",oldMan);
        c.machine.put( "2",mouse);
        c.machine.put( "3",zhangSan);
        System.out.println(c.ALLBook);
        //添加书籍
        c.addBook(oldMan,3);
        c.addBook(mouse,2);
        c.addBook(zhangSan,9);
        System.out.println("增加书籍后：\n"+c.ALLBook);
        c.reduceBook(oldMan,2);
        System.out.println("删除书籍后：\n"+c.ALLBook);



        System.out.println("寻找书籍Title\n:");
        c.findBasedTitle("老人与海");

        System.out.println("寻找书籍publish\n:");
        c.findBasedPublish("上海");//NULL
        System.out.println("寻找书籍publish\n:");
        c.findBasedPublish("西电出版社");

        System.out.println("寻找书籍authors\n:");
        c.findBasedAuthor("李四");
        c.findBasedAuthor("老六");
        c.findBasedAuthor("张三");


    }
}
