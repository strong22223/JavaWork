package Forth_JavaoopCharacter;

public class P65_ConstructSubObj {

    public static void main(String[] args) {
        Undergraduate ug = new Undergraduate(12345678);
    }
}

class Person {
    Person(int i) {
        System.out.println("Person");
    }
}
//class Student extends Person{//��P72���ظ�
//		Student(int id) {
//			super(3);
//			System.out.println("Student "+id); }
//	}

class Undergraduate extends Student {
    Undergraduate(int id) {
        //super(id); //����ʹ�ã���Ϊstudentû��Ĭ�Ϲ��췽��
        System.out.println("Undergraduate");
    }
}