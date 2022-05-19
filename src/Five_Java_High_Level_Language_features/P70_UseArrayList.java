package Five_Java_High_Level_Language_features;

import java.util.ArrayList;
import java.util.List;

public class P70_UseArrayList {
    public static void main(String[] args) {

        List<String> scores = new ArrayList<>();
        List<String> people = new ArrayList<>();
        people.add("��");
        people.add("��");
        people.add("��");

        int num = 10;
        for (int i = 0; i < num; i++) {
            String s = "" + i;
            scores.add(s);
        }
        System.out.println(scores);

        scores.add(1, "99");//ָ����λ�����Ԫ��
        System.out.println(scores);
        //ʹ�ü�ǿforѭ���������
        for (String S : scores) {
            System.out.print(" " + S);
        }
        System.out.println();
        //�޸�ָ��λ�õĶ�Ԫ��
        scores.set(1, "77");
        System.out.println(scores);
        //ɾ��ָ��λ�õ�Ԫ��
        scores.remove(0);
        System.out.println(scores);

        System.out.println("ɾ�����Ԫ���ǣ�");
        for (String S : scores) {
            System.out.print(" " + S);
        }
        System.out.println();
        System.out.println("�ַ�������Ľ���ǣ�" + scores.toString());

        //��ȡ�����ķ�Χ��Ԫ�أ������Ǵ�����һ����LISTֻ��һ��ӳ�䡣
        System.out.println("��ȡ����LIST :" + scores.subList(1, 5));
        List<String> son = scores.subList(1, 5);
        son.clear();
        System.out.println("ɾ����List��ĸ�List " + scores);
        //people�е�Ԫ��ȫ����scores
        if (scores.addAll(2, people))
            System.out.println(scores);

    }
}
