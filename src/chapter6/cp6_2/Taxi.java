package chapter6.cp6_2;

public class Taxi
{
    public String taxiNum;              // �ý� ��ȣ
    public int passengerCount;          // �°� ��
    public int money;                   // ���� ��

    public Taxi(String num) {this.taxiNum = num;}

    public void take(int money)
    {
        this.money += money;
        passengerCount++;
    }
    public void showInfo()
    {
        System.out.println(taxiNum + "�� �°��� " + passengerCount +"���̰�, ������ " + money + "�Դϴ�.");
    }
}
