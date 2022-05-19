package Forth_JavaoopCharacter;

public class MyNaturalNumbers extends MyInteger {
    //����,

    final int flag = 1;//����֤��Ȼ���ķ���λ���� �����仯

    public MyNaturalNumbers() {
    }

    public MyNaturalNumbers(String a) {
        input(a);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        MyNaturalNumbers cMyNaturalNumbers = new MyNaturalNumbers("-2324");

    }

    public boolean input(String iString) {
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

    @Override
    public boolean set(String l) {
        //�ɹ���ʱ�䷵��true
        if (this.input(l))
            return true;
        return false;
    }

    //�ж��Ƿ�Ϊһ������
    private boolean isdigit(String lString) {
        //�洢��ʱ�䵹�Ŵ洢���������

        for (int i = lString.length() - 1, k = 0; i >= 0; i--) {
            //�ж��Ƿ�Ϊ����
            int temp = 0;//����¼���������ֵĴ���
            char ch = lString.charAt(i);
            if (Character.isDigit(ch) || ch == ',') {//һ����������Щ�������
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

    //ʵ��
    public MyInteger toMyInteger() {
        if (this.flag == -1)
            //return false;
            System.out.print("�쳣��");
        MyInteger a = new MyInteger();
        a.longIntegers = this.longIntegers;
        a.length = this.length;
        a.flag = 1;
        return a;
    }

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

}
