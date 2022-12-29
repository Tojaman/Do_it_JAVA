package chapter6.cp6_1;

class BirthDay
{
    String name;
    int day, month, year;

    public void printThis()
    {
        System.out.println(this); // this == bDay(인스턴스가 저장된 힙 주소)
    }
    BirthDay()
    {
        // this == bDay == Birthday. 그냥 특정 인스턴스의 Birthday라고 생각하면 됨
        this("이름 없음", 0, 0, 0); // 디폴트 생성자에서 바로 아래 생성자를 호출
    }
    BirthDay(String name, int day, int month, int year)
    {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    BirthDay returnItSelf()
    {
        return this; // 인스턴스 자신의 주소를 반환
    }
}
public class ThisExample
{
    public static void main(String[] args)
    {
        BirthDay bDay = new BirthDay();
        System.out.println(bDay);
        bDay.printThis();

        BirthDay basic = new BirthDay(); // 디폴트 생성자에서 다른 생성자 호출
        System.out.println(basic.name + basic.day + basic.month + basic.year);

        BirthDay p = basic.returnItSelf(); // basic 인스턴스의 주소를 p에 대입
        System.out.println(p); // So, p의 주소와 basic의 주소가 같아짐
        System.out.println(basic);
    }
}
