package three_LanguaheBasic;

public class CharConst {
    //�����ͽӿ��� ��һ����д������ȫ��Сд
//�������ͷ������׵���Сд���൥�ʵ�����ĸ��д
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        char c1 = 'Q';
// =================Unicode���������ʵ�ַ���
        char c2 = '\u0051';//��λʮ������
        char c3 = 0x0051;//ʮ������
        char c4 = '\121';//��λ�˽���

        System.out.println("c1:" + c1 + " c2:" + c2 + " c3:" + c3 + " c4:" + c4);
        //ת���ַ�
        //+���ַ�������������������ַ��Ļ��ͻ��Զ�ת��Ϊint
        System.out.println('\'' + "+" + '\\');
        System.out.println('\'' + '\\');
        //\r��\n
        System.out.print("AAAAAA" + '\r');
        System.out.print("�ָ���==============");
        System.out.print('\r');
        System.out.print("AAAAAA" + '\n');
        System.out.println("�ָ���==============");

        System.out.println("=======================");

        System.out.print("AAAAAA\n\r");
        System.out.print("�ָ���==============");
        System.out.print('\r');
        System.out.print("AAAAAA\r\n");
        System.out.println("�ָ���==============");

        System.out.print("123\b4567\b89\b");


        System.out.println("\taaaa");
        System.out.println((int) c1);
        System.out.println(c1 + ' ');
    }

}
