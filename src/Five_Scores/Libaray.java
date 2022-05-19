package Five_Scores;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Libaray {
    HashMap<String, Books> machine = new HashMap<String, Books>();
    //AllBook������ֵ����Ϣ��Ҳ�������йݲص��鼮����Ϣ
    public Collection ALLBook = machine.entrySet();
    private int ISBN = 0;
    //
//    //�����鼮���������,��Ϊ��ɽ��Ĺ���
//    private final static int  MAXNUMBER=3;
    //�洢�鼮�ĵ�������ͨ���������ʵ��鼮����Ϣ  //ISBN��ŵĵ���������ȡ����ͨ������ȡ�鼮����Ϣ
    private Iterator<String> AllISBNIt = machine.keySet().iterator();
    /*ͼ������ṩ�Ĺ���
       1.ͼ����ṩ�鼮�洢
       2.����鼮
       3.�����鼮
       4.ɾ���鼮
       5.ͼ�������Ҫ�����ṩ�����鼮�����ƣ������鼮��Ӧ�����ߡ�������
    */
    //���鼮��Ӧ�ı����Ϊ�鼮��Ψһ��ʶ��ʹ��Map���洢�鼮������Book�࣬��ÿһ���鼮��Ӧ�ı�ţ���1��ʼ��Ҳ��������ΪISBN��
    Libaray() {
    }

    //��ͼ������
    public boolean addBook(Books v, Integer n) {
        //����ӵ�ʱ���������ָ�����
        AllISBNIt = machine.keySet().iterator();
        Book m = v.getBook();
        while (AllISBNIt.hasNext()) {
            String key = AllISBNIt.next();
            if (machine.get(key).getBook().equals(m)) {
                machine.get(key).addBook(m, n);
                return true;
            }
        }
        //û����ͬ���鼮��������鼮���ٽ��з���,ֻ��ȥ�����鼮�ĸ�����������ȥ����鼮��

        return true;
    }

    public boolean reduceBook(Books v, int n) {
        //����ӵ�ʱ���������ָ�����
        AllISBNIt = machine.keySet().iterator();
        Book m = v.getBook();
        while (AllISBNIt.hasNext()) {
            String key = AllISBNIt.next();
            if (machine.get(key).getBook().equals(m)) {
//                if(machine.get(key).number<=n){
////                    AllISBNIt.remove();//ֱ���Ƴ�����鼮�����࣬ȫ��ɾ��
//                }else
                machine.get(key).reduBook(m, n);//���ɾ���Ĳ������ʱ�佫���鼮û�б������ɾ��
                return true;
            }
        }
        return false;//û�д���
    }

    //ͼ��ݵ��鼮��Ϣ�Ĳ�ѯ
    public boolean findBasedTitle(String title) {
        //����ӵ�ʱ���������ָ�����
        AllISBNIt = machine.keySet().iterator();
        boolean exited = false;
        while (AllISBNIt.hasNext()) {
            String key = AllISBNIt.next();
            if (machine.get(key).getTitle().equals(title)) {
                System.out.println(machine.get(key));
                exited = true;
            }
        }
        //û���Ҽ���ʱ�䷵��false
        if (exited) return true;
        System.out.println("NULL");
        return false;
    }

    //��ѯ�鼮����
    public boolean findBasedPublish(String publish) {
        //����ӵ�ʱ���������ָ�����
        AllISBNIt = machine.keySet().iterator();
        boolean exited = false;
        while (AllISBNIt.hasNext()) {
            String key = AllISBNIt.next();

            if (machine.get(key).getPublish().equals(publish)) {
                System.out.println(machine.get(key));
                exited = true;
            }
        }
        //û���Ҽ���ʱ�䷵��false
        if (exited) return true;
        System.out.println("NULL");
        return false;
    }

    //��ѯ�鼮�������ߣ�
    public boolean findBasedAuthor(String author) {
        //����ӵ�ʱ���������ָ�����
        AllISBNIt = machine.keySet().iterator();
        boolean exited = false;
        while (AllISBNIt.hasNext()) {
            String key = AllISBNIt.next();
            String[] a = machine.get(key).getArrayAuthors();
            for (String c : a) {
                if (c.equals(author)) {
                    System.out.println(machine.get(key));
                    exited = true;
                    break;
                }
            }
        }
        //û���Ҽ���ʱ�䷵��false
        if (exited) return true;
        System.out.println("NULL");
        return false;
    }
//    //ͼ����Ĺ���
//    public
}
