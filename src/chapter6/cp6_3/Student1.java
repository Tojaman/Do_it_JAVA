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
		int i = 10; // i�� getSerialNum() �Լ� ������ '���� ����'�̹Ƿ� ����� �����ϴ�.
		//studentName = "aaa";   // studentName�� getSerialNum() �Լ��� ���� ������ �ƴϰ� Ŭ������ static ������ �ƴ϶� �ν��Ͻ��� ������ �� ����ȴ�.
								 // ����, �ν��Ͻ��� �����Ǳ� ������ ����� �Ұ����ϹǷ� ������ ����.
		return seriaNum2; // seriaNum2�� private static ������ ���α׷��� ������ڸ��� �ν��Ͻ��� �����Ǳ� ������ ����� �����̰� private�ϱ� Student1 Ŭ���� ���ο����� ��� ������.
						  // ����, �ν��Ͻ��� �����Ǳ� ������ Ŭ���� �Լ����� ��� ������.
	}

	public static void setSerialNum(int serialNum) {
		Student1.seriaNum2 = serialNum;
	}
}
