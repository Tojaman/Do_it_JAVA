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
		int i = 10;
		//studentName = "aaa";   //¿À·ù ³²
		return seriaNum2;
	}

	public static void setSerialNum(int serialNum) {
		Student1.seriaNum2 = serialNum;
	}
}
