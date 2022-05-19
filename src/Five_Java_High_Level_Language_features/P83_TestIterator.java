package Five_Java_High_Level_Language_features;

import java.util.*;

public class P83_TestIterator {
    public static void main(String[] args) {
        String sentence = "I believe I can fly, I believe I can touch the sky.";
        //ͨ��һ�����߶���ָ�����ԭ�����ַ������ָ�Ϊ�ַ�������
        String[] strs = sentence.split(" ");
        //�ڹ��췽���д�����һ��List�ļ���
        List<String> list = new ArrayList<String>(Arrays.asList(strs));

        Iterator<String> it = list.iterator();
        //ɾ����ǰ��������Ԫ��
        it.next();
        it.remove();
        System.out.println(list);
        //��ѯԪ�ص�����,ֻ����ListIterator
        ListIterator<String> v = list.listIterator();
        System.out.println(v.nextIndex());
        //�޸ĵ�ǰ��ѯ����Ԫ�ص�ֵ
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
