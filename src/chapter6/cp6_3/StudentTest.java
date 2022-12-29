package chapter6.cp6_3;

public class StudentTest {

	public static void main(String[] args) {
		// getSerialNum() 함수는 static 함수이므로 인스턴스를 생성하기 전부터 호출 가능
		System.out.println("클래스 외부 출력 : " + Student1.getSerialNum());

		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum); // 일반적인 멤버 변수 출력
		System.out.println(Student1.serialNum);  // static 변수(클래스 변수)를 클래스 이름으로 참조할 수 있음
		System.out.println(Student1.getSerialNum()); // private 멤버 변수를 static 멤버 함수(클래스 함수)로 간접 출력
		System.out.println(studentLee.studentName + " 학번:"  
		                        + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum); // 일반적인 멤버 변수 출력
		System.out.println(Student1.serialNum);  // static 변수(클래스 변수)를 클래스 이름으로 참조할 수 있음
		System.out.println(Student1.getSerialNum()); // private 멤버 변수를 static 멤버 함수(클래스 함수)로 간접 출력
		System.out.println(studentSon.studentName + " 학번:" 
		                        + studentSon.studentID);
	}
}

