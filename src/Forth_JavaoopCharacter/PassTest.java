package Forth_JavaoopCharacter;

//public class PassTest {
//	public void changeInt(int value) {// �������͵Ĳ���
//		System .out.println("value is "+value);
//		value = 55;
//		System .out .println("value is "+value);
//		
//		 
//	}
//	public static void main(String args[]) {
//		int val;
//		PassTest pt = new PassTest();
//
//		val = 11;
//		pt.changeInt(val); // �������Ͳ�����ֵ����
//		System.out.println("Int value is: " + val);
//	}
//}
//public class PassTest {
//	public void changeStr(String value) {  // �������Ͳ���
//		System .out.println("value is "+value);
//		value = "defferent";
//		System .out .println("value is "+value);
////		
//	}
//	public static void main(String args[]) {
//		String str;
//		PassTest pt = new PassTest();
//
//		str = new String("Hello");
//		pt.changeStr(str); // �������Ͳ����Ĵ���
//		System.out.println("Str value is: " + str);
//	}
//}
public class PassTest {
    float ptValue;

    public static void main(String args[]) {
        PassTest pt = new PassTest();

        pt.ptValue = 101.0f;
        pt.changeObjValue(pt); // �������Ͳ����Ĵ���
        System.out.println("Pt value is: " + pt.ptValue);
    }

    public void changeObjValue(PassTest ref) {// �������Ͳ���
        ref.ptValue = 99.0f;  //�ı������ָ����ĳ�Ա����ֵ
    }
}
