package Forth_JavaoopCharacter;

public class Test {

    public static void main(String[] args) {
        MyNaturalNumbers x = new MyNaturalNumbers("7867");
        MyNaturalNumbers y = new MyNaturalNumbers("7867312");
        MyNaturalNumbers z = new MyNaturalNumbers();
        System.out.println(z.subtraction(x, y));

//
//		//�������ݵ�����������
//		/*	һ.��������
//		 * 		1.��һ���ǵ���input()������������
//		 * 		2.�ڶ������ڹ��췽���������������
//		 * 		3.��������ȷ�Ľ���ǧ��λ������
//		 * 		3.�ֱ��������������
//		 * */
//		MyInteger aInteger =new MyInteger("456776543456");
//		MyInteger bInteger =new MyInteger("-12356");
//		MyInteger cInteger =new MyInteger();
//		//aInteger.input();//����aInteger
//		System .out .print("1.�������:\n");
//		aInteger .output();
//		bInteger .output();
//	//	cInteger .output();
//			//Myinteger�����Բ���!
//		/*
//		 * 		1.���ֵĳ���
//		 * 		2�����ֵ�������ʹ��flag��ȷ����1��������Ϊ����-1��������Ϊ����
//		 *
//		 * */
//		System .out .println("2.a�ĳ��ȣ�"+aInteger .length+"  b�ĳ���:"+bInteger .length  );
//		System .out .println("3.��1����������-1��������\n"+"a����Ϊ��"+aInteger .flag +" b����Ϊ "+bInteger .flag );
//		/*
//		 * MyInteger�ķ�������
//		 * 		1.�ӷ�
//		 * 		2.����
//		 * 		3.CInteger��Ϊ������ܣ����ҽ������||���ߵ���cInteger��output�����������
//		 * 		4.
//		 */
//
//		System .out .println("4.�ӷ�����ǣ�"+cInteger .addition(aInteger, bInteger));
//		aInteger .set("-1234567");bInteger .set("-12345");
//		System .out .println("-1234567��-12345�Ľ����"+cInteger .addition(aInteger, bInteger));
//
//
//		System.out.println("5.��������ǣ�"+cInteger .subtraction(aInteger, bInteger));
//		aInteger .set("121313");
//
//		System .out .println("6.���¸�ֵ���Interger:"+aInteger );
//
//		System .out .println("7.aInterger��bInterger�ıȽ�:"+aInteger .equals(bInteger ));
//
//		System .out.println("8.aInterger����ת��ΪString�����:"+aInteger .toString());
//
//		//������Ȼ��ת��Ϊͬ��ֵ��Myterger
//		MyNaturalNumbers cMyNaturalNumbers =new MyNaturalNumbers("9999999");
//		MyInteger zzInteger=cMyNaturalNumbers.toMyInteger ();
//		System .out .print("9.�������MynarturalNumbersת��ΪMyinter" );
//		zzInteger.output();
//
        /*
         * 	������Ч���ݵ�����
         * 	1.ǧ��λ����
         */
        //aInteger .set("12,332,23");//ǧ��λ����ʾ��
        //cMyNaturalNumbers .set("-1213");//��Ȼ������ʾ��
    }

}
