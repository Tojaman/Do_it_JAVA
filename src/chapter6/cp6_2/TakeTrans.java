package chapter6.cp6_2;

public class TakeTrans {

    public static void main(String[] args) {
        // �� ���� �л��� ����
        Student studentJames = new Student("James", 5000);
        Student studentTomas = new Student("Tomas", 10000);
        Student studentEdward = new Student("Edward", 10000);

        Bus bus100 = new Bus(100);
        studentJames.takeBus(bus100);     // james�� 100�� ������ Ž
        studentJames.showInfo();           // james ���� ���
        bus100.showInfo();                // ���� ���� ���

        Subway subwayGreen = new Subway("2ȣ��");
        studentTomas.takeSubway(subwayGreen);  // Tomas�� 2ȣ���� Ž
        studentTomas.showInfo();                 // Tomas ���� ���
        subwayGreen.showInfo();

        Taxi taxi7777 = new Taxi("tojaman486");
        studentEdward.takeTaxi(taxi7777);
        studentEdward.showInfo();
        taxi7777.showInfo();
    }
}