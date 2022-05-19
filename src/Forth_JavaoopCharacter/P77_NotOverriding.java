package Forth_JavaoopCharacter;

class Base {
    public static int i = 100;

    public static int getI() {
        return i;
    }

    public void increase() {
        i++;
    }
}

public class P77_NotOverriding extends Base {
    public static int i = 5;

    public static int getI() {
        return i;
    }

    public static void main(String[] args) {
        P77_NotOverriding no = new P77_NotOverriding();
        //no.increase();//���ø���ģ���Ϊ����û�У��������е�i������Ϊ101���������е�i������û�з����仯��

        System.out.println(no.i);
        System.out.println(no.getI());
        //������Ķ���ǿ��׼��Ϊ����������еĵ��ö��Ǹ���???
        Base cBase = no;//�������ͣ����������еĶ��������أ����Ǽ̳еĶ�����ʹ������ķ���
        cBase.increase();//�����ǵ�����
        System.out.println(cBase.i);//���ʵ��Ǹ����б����ص�����
        System.out.println(cBase.getI());//�����ǵķ������ʵ��������
        System.out.println(no.getI());
    }

    public void increase() {
        this.i = 99;
        String string = "sds";
    }
}
