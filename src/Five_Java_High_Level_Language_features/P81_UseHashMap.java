package Five_Java_High_Level_Language_features;
import java.util.*;
public class P81_UseHashMap {
    public static void main(String []args) {
        HashMap<String, String> hScore = new HashMap<>();
        hScore.put("张一", "86");
        hScore.put("李二", "98");
        hScore.put("海飞", "99");
        System.out.println("按字符串输出：" + hScore.toString());

        hScore.put("李二", "77");
        System.out.println("按字符串输出：" + hScore);

        hScore.remove("张一");
        System.out.println("修改并删除之后");
        System.out.println("按字符串输出：" + hScore);

        System.out.println(hScore.containsValue("李四"));
        System.out.println(hScore.containsKey("李四"));

    }
}