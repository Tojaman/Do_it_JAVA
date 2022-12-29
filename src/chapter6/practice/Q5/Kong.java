package chapter6.practice.Q5;

public class Kong
{
    String coffee;
    int money;
    int customerCount;

    public void take(int money, String coffee)
    {
        this.money += money;
        this.coffee = coffee;
        customerCount++;
    }
    public void showInfo()
    {
        System.out.println("손님 수 : " + customerCount + " / 수입 : " + money + " / 커피 : " + coffee);
    }
}

