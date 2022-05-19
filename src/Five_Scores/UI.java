package Five_Scores;

public class UI {
    public static void main(String[] args) {
/*
        1.����ͼ��ݵĹ��ܷ�Ϊ�ڳ�ʼ��ʼ����ʱ��ȥ����鼮�����࣬��������鼮������֮�󷽱�����ڿ�����ӵ�ǰ�����鼮�ľ����鼮��
        ǰ���Ӧ����һ���鼮�Ĺݲ��룬��Ϊÿ���鼮��Ψһ��ʶ��
        2.����鼮��
        3.ɾ���鼮
        4.�����鼮


 */
        Libaray c = new Libaray();
        Books oldMan = new Books("�����뺣", "���������", "����", "�");
        Books mouse = new Books("������", "���������", "����", "����");
        Books zhangSan = new Books("����������", "����������", "����", "�");
        //�����鼮�����鼮����Ϣ����,ǰ��ı���൱��һ����Ĺݲ���
        c.machine.put("1", oldMan);
        c.machine.put("2", mouse);
        c.machine.put("3", zhangSan);
        System.out.println(c.ALLBook);
        //����鼮
        c.addBook(oldMan, 3);
        c.addBook(mouse, 2);
        c.addBook(zhangSan, 9);
        System.out.println("�����鼮��\n" + c.ALLBook);
        c.reduceBook(oldMan, 2);
        System.out.println("ɾ���鼮��\n" + c.ALLBook);


        System.out.println("Ѱ���鼮Title\n:");
        c.findBasedTitle("�����뺣");

        System.out.println("Ѱ���鼮publish\n:");
        c.findBasedPublish("�Ϻ�");//NULL
        System.out.println("Ѱ���鼮publish\n:");
        c.findBasedPublish("���������");

        System.out.println("Ѱ���鼮authors\n:");
        c.findBasedAuthor("����");
        c.findBasedAuthor("����");
        c.findBasedAuthor("����");


    }
}
