package chapter6.practice.Q5;

public class takecoffee
{
    public static void main(String[] args)
    {
        Kim kim = new Kim("kim","�Ƹ޸�ī��", 10000);
        Lee lee = new Lee("lee", "��", 15000);

        Star st = new Star();
        kim.takecoffee(st);
        kim.showInfo();
        st.showInfo();

        Kong ko = new Kong();
        lee.takecoffee(ko);
        lee.showInfo();
        ko.showInfo();

    }
}
