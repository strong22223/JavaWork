package Five_Java_High_Level_Language_features;

import java.util.Random;

class Value {
    int i;

    public Value(int i) {
        this.i = i;
    }
}

public class P29_FinalData {
    private static Random rand = new Random(47);
    private final int valueOne = 9;        // �������ͱ���ʱ����
    private final int i4 = rand.nextInt(20);// ����ʱ���ɱ�,���Ǳ���ʱ����
    private final Value v2 = new Value(22);    //�������ͳ���
    private final int[] a = {1, 2, 3, 4, 5, 6};    //�������ͳ���
    private Value v1 = new Value(11);

    public static void main(String[] args) {
        P29_FinalData fd1 = new P29_FinalData();
        //fd1.valueOne++; fd1.i4++; 	//valueOne, i4���ܸ���
        fd1.v1 = new Value(9);    // v1����final��, �����õ��µĶ���
        // fd1.v2=new Value(0); 	//v2��final��,�������õ��µĶ���
        fd1.v2.i++;        // v2���ò��ܸ���,��������ɸ���
        // fd1.a=new int[3];	//����aΪfinal,�������õ��µ�����
        for (int i = 0; i < fd1.a.length; i++) {
            fd1.a[i]++; // ����a��final��,������Ԫ�ز���final��
        }
    }
}
