package chapter6.cp6_3;

public class StudentTest {

	public static void main(String[] args) {
		// getSerialNum() �Լ��� static �Լ��̹Ƿ� �ν��Ͻ��� �����ϱ� ������ ȣ�� ����
		System.out.println("Ŭ���� �ܺ� ��� : " + Student1.getSerialNum());

		Student1 studentLee = new Student1();
		studentLee.setStudentName("������");
		System.out.println(studentLee.serialNum); // �Ϲ����� ��� ���� ���
		System.out.println(Student1.serialNum);  // static ����(Ŭ���� ����)�� Ŭ���� �̸����� ������ �� ����
		System.out.println(Student1.getSerialNum()); // private ��� ������ static ��� �Լ�(Ŭ���� �Լ�)�� ���� ���
		System.out.println(studentLee.studentName + " �й�:"  
		                        + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("�ռ���");
		System.out.println(studentSon.serialNum); // �Ϲ����� ��� ���� ���
		System.out.println(Student1.serialNum);  // static ����(Ŭ���� ����)�� Ŭ���� �̸����� ������ �� ����
		System.out.println(Student1.getSerialNum()); // private ��� ������ static ��� �Լ�(Ŭ���� �Լ�)�� ���� ���
		System.out.println(studentSon.studentName + " �й�:" 
		                        + studentSon.studentID);
	}
}

