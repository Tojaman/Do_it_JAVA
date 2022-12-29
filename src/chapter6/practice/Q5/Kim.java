package chapter6.practice.Q5;

public class Kim
{
    String name;
    String coffee;
    int money;

    public Kim(String name, String coffee, int money)
    {
        this.name = name;
        this.coffee = coffee;
        this.money = money;
    }

    public void takecoffee(Star st)
    {
        st.take(4000,this.coffee);
        this.money -= 4000;
    }
    public void showInfo() {
        System.out.println("이름 : " + name + " / 커피 : " + coffee + " / 남은 돈 : " + money);
    }
}
