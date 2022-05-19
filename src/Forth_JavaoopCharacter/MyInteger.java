package Forth_JavaoopCharacter;

import java.util.LinkedList;
import java.util.Scanner;


public class MyInteger {

    public int length;//�洢���ֵĳ���
    LinkedList<Integer> longIntegers = new LinkedList<Integer>();
    Scanner inScanner = new Scanner(System.in);
    int flag = 1;//����λ
    //������
    fun f = new fun();//���õķ�����


    public MyInteger() {
        length = longIntegers.size();
    }

    public MyInteger(String lString) {

        length = longIntegers.size();
        input(lString);
    }
    //���췽������ʼ������Length


    //��дtoString����
    @Override
    public String toString() {
        String c = "";
        String b = "";
        for (int i = longIntegers.size() - 1; i >= 0; i--) {
            c = b + longIntegers.get(i);
            b = c;
        }
        if (this.flag == -1)
            return "-" + c;
        return c;
    }


    //��дequals
    public String equals(MyInteger a) {

        int i = 0;
        MyInteger c = (MyInteger) a;
        int flag = 0;
        if (this.length > c.length) {
            flag = 1;
        } else if (this.length == c.length) {

            while (i < this.length) {
                if (this.longIntegers.get(i) > c.longIntegers.get(i)) {
                    flag = 1;
                    break;
                } else if (this.longIntegers.get(i) < c.longIntegers.get(i)) {
                    flag = -1;
                    break;
                } else flag = 0;
            }

        } else
            flag = -1;

        switch (flag) {
            case 1:
                return "����";
            case -1:
                return "С��";
            case 0:
                return "����";

        }
        return "ERROR";
    }

    //�ж��Ƿ�Ϊһ������
    private boolean isdigit(String lString) {
        //�洢��ʱ�䵹�Ŵ洢���������
        for (int i = lString.length() - 1, k = 0; i >= 0; i--) {
            //�ж��Ƿ�Ϊ����
            int temp = 0;//����¼���������ֵĴ���
            char ch = lString.charAt(i);
            if (Character.isDigit(ch) || ch == ',' || ch == '-') {//һ����������Щ�������
                if (ch == ',') {
                    temp++;
                    if ((temp + k) % 3 != 1)
                        return false;
                }
                if (ch == '-') {
                    if (i != 0)
                        return false;
                }
            } else {
                return false;
            }
            if (ch != ',') k++;//���ԡ�������Ӱ��
        }
        if (lString.charAt(0) == '-')
            this.flag = -1;//����������λ����
        //��������
        for (int i = lString.length() - 1, k = 0; i >= 0; i--) {
            char ch = lString.charAt(i);
            if ((Character.isDigit(ch))) {
                longIntegers.add(k, 0);
                longIntegers.set(k, ch - '0');
                k++;//�ǵã�������
            }
        }
        return true;
    }

    //����
    public boolean set(String l) {
        //�ɹ���ʱ�䷵��true
        if (this.input(l))
            return true;
        return false;

    }

    //�����������
    protected boolean input() {
        System.out.println("�����볤������");
        String iString = inScanner.nextLine();
        this.longIntegers.clear();
        while (!isdigit(iString)) {
            System.out.println("��������Ƿ���Ҫ�������룿Yes/No");
            iString = inScanner.nextLine();
            if (iString.equals("Yes")) {
                iString = inScanner.nextLine();
            } else {
                System.out.println("����");
                return false;
            }
        }
        //���ó���
        length = longIntegers.size();
        return true;
    }

    protected boolean input(String iString) {
        this.longIntegers.clear();
        while (!isdigit(iString)) {
            System.out.println("��������Ƿ���Ҫ�������룿Yes/No");
            iString = inScanner.nextLine();
            if (iString.equals("Yes")) {
                iString = inScanner.nextLine();
            } else {
                System.out.println("����");
                return false;
            }
        }
        //���ó���
        length = longIntegers.size();
        return true;

    }

    //���һ������
    public void output() {
        System.out.println(this.toString());
    }

    public MyInteger addition(MyInteger A, MyInteger B) {
        //����,�����֮���˳��������Ѿ���������Ҫ�����ظ�ִ��
        //����Ϊ�ʸ���ܽ����ʱ��
        if (A.flag == 1 && B.flag == 1) {
            f.add(A, B);
            //this.output();
            return this;
        }
        if (A.flag == -1 && B.flag == -1) {
            f.add(A, B);
            this.flag = -1;
//			this.output();
            return this;
        }
        if (A.flag == -1 && B.flag == 1) {
            if (A.equals(B).equals("����")) {
                f.sub(A, B);
                this.flag = -1;
            } else
                f.sub(A, B);

//			this.output();
            return this;
        }
        if (A.flag == 1 && B.flag == -1) {
            if (A.equals(B).equals("С��")) {
                f.sub(A, B);
                this.flag = -1;
            } else
                f.sub(A, B);

//			this.output();
            return this;
        }

//		this.output();
        return this;
    }

    public MyInteger subtraction(MyInteger A, MyInteger B) {
        //���������A,��ѡ�������Ϊ���ֱ�����

        if (A.flag == -1 && B.flag == 1) {
            f.add(A, B);
            this.flag = -1;
            //		this.output();
            return this;
        }
        if (A.flag == -1 && B.flag == -1) {
            if (A.equals(B).equals("����")) {
                f.sub(A, B);
                this.flag = -1;
            } else
                f.sub(A, B);

            //	this.output();
            return this;
        }
        if (A.flag == 1 && B.flag == 1) {
            if (A.equals(B).equals("С��")) {
                f.sub(A, B);
                this.flag = -1;
            } else
                f.sub(A, B);

            //this.output();
            return this;
        }
        if (A.flag == 1 && B.flag == -1) {
            f.add(A, B);
            //this.output();
            return this;
        }
        //this.output();
        return this;
    }

    //����,ǰ�߼�ȥ����

    //δ��ɳ˷�
    public MyInteger multiplication(MyInteger A, MyInteger B) {
        int Alen = A.length - 1;//ȷ�����ȣ�ֱ��ȷ�������λ��
        int Blen = B.length - 1;

        if (Alen > Blen) {//ʵ�ֽ�����
            int temp = Alen;
            Alen = Blen;
            Blen = temp;
            MyInteger tInteger = A;
            A = B;
            B = tInteger;
        }
        //����̵���Ϊһ����׼
        int a = 0;
        for (int i = 0; i <= Alen; i++) {
            for (int j = 0; j <= Blen; j++) {
                a = A.longIntegers.get(i) * B.longIntegers.get(j) + a;
                //	if()
                longIntegers.add(i, 0);
                longIntegers.set(i, (a % 10));
                a /= 10;
            }
        }

        this.output();
        return this;
    }

    //����
    class fun {
        //swap
        private boolean swap(MyInteger A, MyInteger B) {
            //���������ĳ�Ա,ʵ�ֽ���������
            //MyInteger .this.longIntegers .clear();
            if (A.equals(B).equals("С��")) {//ʵ�ֽ�����
                MyInteger t = new MyInteger();
                t.longIntegers = A.longIntegers;
                t.length = A.length;
                t.flag = A.flag;
                A.longIntegers = B.longIntegers;
                A.length = B.length;
                A.flag = B.flag;
                B.longIntegers = t.longIntegers;
                B.length = t.length;
                B.flag = t.flag;
                return true;
            }
            return false;
        }

        //�ӷ�
        private MyInteger add(MyInteger aInter, MyInteger bInter) {
            //Ϊ�˽���ڽ�����ʱ�佫ԭʼ���ݽ���������kelong
            MyInteger A = aInter;
            MyInteger B = bInter;
            //����ȷ����׼,
            MyInteger.this.longIntegers.clear();
            boolean swaped = (f.swap(A, B));


            int Alen = A.length - 1;//ȷ�����ȣ�ֱ��ȷ�������λ��
            int Blen = B.length - 1;
            //����̵���Ϊһ����׼
            int i = 0, a = 0;
            while (i <= Alen) {

                MyInteger.this.longIntegers.add(i, 0);
                if (i <= Blen)
                    a = A.longIntegers.get(i) + B.longIntegers.get(i) + a;
                else
                    a = A.longIntegers.get(i);

                MyInteger.this.longIntegers.set(i, (a % 10));
                a /= 10;
                //System .out.println("�Ӻ�Ϊ"+resultIntegers .get(i));
                //ֻ����λ��С�����ֱ�Ϊ0��ʱ���ȥ����
                i++;
            }
            if (swaped) f.swap(B, A);
            return MyInteger.this;
        }

        //����
        private MyInteger sub(MyInteger aInter, MyInteger bInter) {
            //������ȷ����׼
            MyInteger A = aInter;
            MyInteger B = bInter;
            MyInteger.this.longIntegers.clear();
            boolean swaped = f.swap(A, B);

            int Alen = A.length - 1;//ȷ�����ȣ�ֱ��ȷ�������λ��
            int Blen = B.length - 1;


            //����̵���Ϊһ����׼
            int i = 0, min = 0, sub = 0, next = 0;
            while (i <= Alen) {
                //λ����ȷ��
                if (i != Alen || A.longIntegers.get(i) != 0) {
                    longIntegers.add(i, 0);
                    min = A.longIntegers.get(i);
                    if (i <= Blen)
                        sub = B.longIntegers.get(i);
                    if (i < Alen)
                        next = A.longIntegers.get(i + 1);

                    if (i <= Blen) {

                        if (min < sub) {
                            min += 10;//��λ���
                            A.longIntegers.set(i + 1, next - 1);
                            longIntegers.set(i, min - sub);
                        } else MyInteger.this.longIntegers.set(i, min - sub);
                    } else MyInteger.this.longIntegers.set(i, min);
                    //����������β�Ŀ�ȱ
                }
                i++;
            }
            if (swaped) f.swap(B, A);//��������
            return MyInteger.this;
        }

    }


}
