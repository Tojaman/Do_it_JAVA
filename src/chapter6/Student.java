package chapter6;

public class Student {
	 public String studentName;    // �л� �̸�
	 public int grade;              // �г�
	 public int money;             // �л��� ������ �ִ� ��
	
	 public Student(String studentName, int money)  // �̸��� �� �ʱ�ȭ�ϱ�
	 {   
		  this.studentName = studentName;
		  this.money = money;
	 }
	    
	 public void takeBus(Bus bus) {
		  bus.take(1000);
		  this.money -= 1000;
	 }
	    
	 public void takeSubway(Subway subway) {
		  subway.take(1500);
		  this.money -= 1500;
	 }
	    
	 public void showInfo() {
		  System.out.println(studentName + "���� ���� ���� " + money + "�Դϴ�.");
	 }


}