package Five_Java_High_Level_Language_features;

import java.util.*;

public class P70_UseArrayList {
    public static void main(String []args) {

        List<String> scores = new ArrayList<>();
        List<String> people=new ArrayList<>();
        people.add("你");        people.add("我");        people.add("他");

        int num=10;
        for(int i=0;i<num;i++){
            String s=""+i;
            scores.add(s) ;
        }
        System.out.println(scores);

        scores.add(1, "99");//指定的位置添加元素
        System.out.println(scores);
        //使用加强for循环将其输出
        for (String S : scores) {
            System.out.print(" "+S);
        }
        System.out.println();
        //修改指定位置的额元素
        scores.set(1, "77");
        System.out.println(scores);
        //删除指定位置的元素
        scores.remove(0);
        System.out.println(scores);

        System.out.println("删除后的元素是：");
        for (String S:scores) {
            System.out.print(" "+S );
        }  System.out.println();
        System.out.println("字符串输出的结果是："+scores.toString());

        //截取所属的范围的元素，并不是创建了一个子LIST只是一个映射。
        System.out.println("截取的子LIST :"+scores.subList(1,5));
        List<String >son=scores.subList(1,5);son.clear();
        System.out.println("删除子List后的父List "+scores);
        //people中的元素全部给scores
        if( scores.addAll(2,people))
        System.out.println(scores);

    }
}
