package Five_Java_High_Level_Language_features;
import java.util.*;
public class P83_TestIterator{
    public static void main(String[] args){
        String sentence="I believe I can fly, I believe I can touch the sky.";
     //通过一个或者多个分隔符将原来的字符串，分割为字符串数组
        String[] strs=sentence.split(" ");
        //在构造方法中创建了一个List的集合
        List<String> list=new ArrayList<String>( Arrays.asList(strs) );

        Iterator<String> it=list.iterator();
        //删除当前遍历到的元素
        it.next();
        it.remove();
        System.out.println(list);
        //查询元素的索引,只有在ListIterator
        ListIterator<String> v= list.listIterator();
        System.out.println(v.nextIndex());
        //修改当前查询到的元素的值
        v.next();
        v.set("32");
        System.out.println(list);
       // v.next();
        v.add("666");
        System.out.println(list);

//        while(it.hasNext())
//            System.out.print(it.next()+"_");
//        System.out.println();

//        it=list.iterator();D
//        while(it.hasNext()){
//            if(it.next().equals("I"))
//                it.remove();
//        }
//        it=list.iterator();
//        while(it.hasNext())
//            System.out.print(it.next()+" ");
//        System.out.println();
    }
}
