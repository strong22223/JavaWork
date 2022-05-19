package Five_Java_High_Level_Language_features;

import java.util.HashMap;

public class P81_UseHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hScore = new HashMap<>();
        hScore.put("��һ", "86");
        hScore.put("���", "98");
        hScore.put("����", "99");
        System.out.println("���ַ��������" + hScore.toString());

        hScore.put("���", "77");
        System.out.println("���ַ��������" + hScore);

        hScore.remove("��һ");
        System.out.println("�޸Ĳ�ɾ��֮��");
        System.out.println("���ַ��������" + hScore);

        System.out.println(hScore.containsValue("����"));
        System.out.println(hScore.containsKey("����"));

    }
}