package Forth_JavaoopCharacter;

public class EmpInfo {
    String nameString;
    String designnationString;
    String departmentString;

    public EmpInfo() {
    }

    public EmpInfo(String name, String designnation, String department) {
        nameString = name;
        designnationString = designnation;
        departmentString = department;
    }

    public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		EmpInfo emp1=new EmpInfo("Robert Java", "Manager", "Coffwee shop");
//		EmpInfo emp2=new EmpInfo("Tom Java", "Worker", "Coffwee shop");
//
//		emp1.print();
//		emp2.print();
//
        Integer c = new Integer(32);
        System.out.println(c);
    }

    // way
    public void print() {
        System.out.println("name is " + nameString
                + "\ndesignation is " + designnationString +
                "\ndepartment is " + departmentString);
    }

}
