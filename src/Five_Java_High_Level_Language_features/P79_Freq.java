package Five_Java_High_Level_Language_features;
import java.util.*;
public class P79_Freq{
    public static void main(String []args){
        String words[]={"if","it","is","to","be","it","is","up","to",
        "me","to", "delegate"};
        Integer freq;
        Map<String,Integer> m=new TreeMap<String,Integer>();
//        Map<String ,Integer> w=new HashTable<String,Integer>();
        for(String a:words){
            freq=m.get(a);
//            System.out.println(freq);
            if(freq==null)
                freq=new Integer(1);
            else freq=new Integer(freq+1);

            m.put(a,freq);
        }
        System.out.println(m.size()+" distinct words detected: "+m);
    if(m.containsKey("is")){
        System.out.println("Yes ! \"is\" Key is existed!");
    }
        if(!m.containsKey("dada")){
            System.out.println("NO ! \"is\" Key not is existed!");
        }
        //接受一个键值对
        Set<Map.Entry<String, Integer>> v=m.entrySet();
        System.out.println(v);

        // 获取所有的键所组成的集合，这个将作为一个集合Set来接受
        Set<String> c=m.keySet();
        System.out.println(c);
        //返回一个所有键所对应的数值
        Collection values=m.values();
        System.out.println(values);

    }
}
