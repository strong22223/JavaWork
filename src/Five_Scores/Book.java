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
    //�������ԣ��������������ߣ��ݲ�������

    Student who =null;
    int number=0;
    public boolean inLibrary=true;//�ж��Ƿ��ڹ�,״̬Ϊ����
    //��д���equals�����������ж��鼮�Ƿ���ȣ����ж��鼮�Ƿ���ȵ�ʱ�䣬��ȥ�жϱ�������
     public   String title;
        public   String publish;
        ArrayList<String> authors=new ArrayList<>();

        //��������ʹ��
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
    //��дString����,���������book����Ϣ��ʱ�佫���еĶ���ȫ�����
    @Override
    public String toString(){
        String title="����:��"+this.title+"��";
        String publish="������:"+this.publish;
        String [] author = new String[authors.size()];
        authors.toArray(author);
        String a="����:";
       for(String c:author ){
           a+=c+" ";
       }

        return  title+"\n"+publish+"\n"+a+"\n"+"inLibrary:"+this.inLibrary+'\n';

    }

    /*�鼮�ܹ��ṩ�ķ���

     * */

//    private int getNumber(){û��Ҫ����Books�����
//        return this.number;
//    }
    //�����鼮������
//    public  boolean addBook(int num){
//        number+=num;
//        return true;
//    }
//    //�����鼮������
//    public  boolean reduBook(int num){
//        if(getNumber()-num<0)
//            return false;
//        else this.number-=num;
//        return true;
//    }
//    //��������
    public String getTitle(){
        return this.title;
    }
    //�������ߵ���Ϣ
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
    //���س��������Ϣ
    public String getPublish(){
        return this.publish;
    }


}
