package chapter6.cp6_3;

public class StudentTest {

	public static void main(String[] args) {

		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		System.out.println(Student1.serialNum);  //serialNum 변수를 클래스 이름으로 참조할 수 있음
		System.out.println(Student1.getSerialNum());
		System.out.println(studentLee.studentName + " 학번:"  
		                        + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(Student1.serialNum);  //serialNum 변수를 클래스 이름으로 참조할 수 있음
		System.out.println(Student1.getSerialNum());
		System.out.println(studentSon.studentName + " 학번:" 
		                        + studentSon.studentID);
	}
}

