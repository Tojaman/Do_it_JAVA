package chapter6;

public class Taxi
{
    public String taxiNum;              // 택시 번호
    public int passengerCount;          // 승객 수
    public int money;                   // 수입 액

    public Taxi(String num) {this.taxiNum = num;}

    public void take(int money)
    {
        this.money += money;
        passengerCount++;
    }
    public void showInfo()
    {
        System.out.println(taxiNum + "의 승객은 " + passengerCount +"명이고, 수입은 " + money + "입니다.");
    }
}
