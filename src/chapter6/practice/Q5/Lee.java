package chapter6.practice.Q5;

public class Lee
{
    String name;
    String coffee;
    int money;

    public Lee(String name, String coffee, int money)
    {
        this.name = name;
        this.coffee = coffee;
        this.money = money;
    }
    public void takecoffee(Kong ko)
    {
        ko.take(4500, this.coffee);
        this.money -= 4500;
    }
    public void showInfo() {
        System.out.println("이름 : " + name + " / 커피 : " + coffee + " / 남은 돈 : " + money);
    }
}
