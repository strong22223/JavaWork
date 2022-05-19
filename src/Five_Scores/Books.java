package Five_Scores;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Books {

    //Books����ͬ�鼮�Ĵ洢����������ʾһ���鼮��ͬ���ĸ���״̬���������״̬֮��ֵ�ǻ�ͨ��
    ArrayList<Book> books = new ArrayList<>();
    ListIterator<Book> booksIterator = books.listIterator();
    int number = books.size();//ͬһ���鼮�ı���
    Book a = new Book();//����������鼮���������������պ���Ӹ��鼮��ʱ���ж��Ƿ����
    Books(String title, String publish, String... authors) {
        this.a.title = title;
        this.a.publish = publish;
        this.a.authors = new ArrayList<>(Arrays.asList(authors));
        this.a.number++;
        books.add(a);
        this.number = books.size();
    }
    // �����鼮,��������ӻ��߼����鼮��ʱ�����ж��Ƿ���ͬһ���鼮

    /*
    ��дbooks��TOString�������������������鼮��ʱ�䣬�������鼮��Ϣ�͹ݲ���ȫ�����
    �������Ҫȥ��ѯ�鼮��ʱ���ѯ������ÿһ��������鼮��״̬�����˷�����д
     */
    @Override
    public String toString() {
        Book temp = this.getBook();
        StringBuilder a = new StringBuilder();
        String title = temp.getTitle();
        String publish = temp.getPublish();
        String authors = temp.getAuthors();

        return "����:��" + title + "��\n������:" + publish + "\n����:" + authors + "\n�ݲ���:" + this.number;
    }

    public Book getBook() {
        return books.get(0);
    }

    public boolean addBook(Book n, int m) {
        while (m-- != 0)
            books.add(n);
        number = books.size();
        return true;
    }

    public boolean reduBook(Book n, int m) {
        booksIterator = books.listIterator();
        while (booksIterator.hasNext() && m != 0) {
            if (booksIterator.next().inLibrary) {
                booksIterator.remove();
                m--;//�����鼮�����鼮�ڹݵ�ʱ��ʱ�佫������
            } else {
            }
        }
        this.number = books.size();//���䳤��
        if (m != 0) {
            System.out.println("ʣ��" + m + "��û���Ƴ����ѱ������");
            return false;
        }
        return true;
    }

    //�õ�����
    public String getTitle() {
        return books.get(0).getTitle();
    }

    //�õ�������
    public String getPublish() {
        return books.get(0).getPublish();
    }

    //�õ�������
    public String getAuthors() {
        return books.get(0).getAuthors();
    }

    public String[] getArrayAuthors() {
        return books.get(0).getArrayAuthors();
    }
//    public static void main(String args[]){
//        Books one=new Books("�����뺣","����","����","�");
//        System.out.println(one.books);
//    }
}
