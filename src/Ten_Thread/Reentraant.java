package Ten_Thread;


//�������Ŀγ�����,��һ���������������ʱ��,�������ظ��Ļ�������,���ķ��������ظ�������������ȡ����
public class Reentraant {
    public synchronized void a(){
        b();
        System.out.println("Here I am in a()");
    }
    public synchronized void b(){
        System.out.println("Here I am in b()");
    }

    public static void main(String[] args) {
        new Reentraant().a();
    }
}
