package chapter6.cp6_3;

public class Student1 {
	
	public static int serialNum = 1000;
	private static int seriaNum2 = 10000;
	int studentID;
	int studentID2;
	String studentName;
	int grade;
	String address;
	
	public Student1(){
		serialNum++;
		seriaNum2++;
		studentID = serialNum;
		studentID2 = serialNum;
	}
	
	public String getStudentName(){
		return studentName;
	}
	
	public void setStudentName(String name){
		studentName = name;
	}

	public static int getSerialNum() {
		int i = 10; // i는 getSerialNum() 함수 내부의 '지역 변수'이므로 사용이 가능하다.
		//studentName = "aaa";   // studentName은 getSerialNum() 함수의 지역 변수도 아니고 클래스의 static 변수가 아니라서 인스턴스가 생성될 때 선언된다.
								 // 따라서, 인스턴스가 생성되기 전에는 사용이 불가능하므로 오류가 난다.
		return seriaNum2; // seriaNum2는 private static 변수라서 프로그램이 실행되자마자 인스턴스가 생성되기 전부터 선언된 변수이고 private니깐 Student1 클래스 내부에서만 사용 가능함.
						  // 따라서, 인스턴스가 생성되기 전부터 클래스 함수에서 사용 가능함.
	}

	public static void setSerialNum(int serialNum) {
		Student1.seriaNum2 = serialNum;
	}
}
