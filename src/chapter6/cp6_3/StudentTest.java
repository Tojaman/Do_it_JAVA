package chapter6.cp6_3;

public class StudentTest {

	public static void main(String[] args) {

		Student1 studentLee = new Student1();
		studentLee.setStudentName("������");
		System.out.println(studentLee.serialNum);
		System.out.println(Student1.serialNum);  //serialNum ������ Ŭ���� �̸����� ������ �� ����
		System.out.println(Student1.getSerialNum());
		System.out.println(studentLee.studentName + " �й�:"  
		                        + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("�ռ���");
		System.out.println(studentSon.serialNum);
		System.out.println(Student1.serialNum);  //serialNum ������ Ŭ���� �̸����� ������ �� ����
		System.out.println(Student1.getSerialNum());
		System.out.println(studentSon.studentName + " �й�:" 
		                        + studentSon.studentID);
	}
}

