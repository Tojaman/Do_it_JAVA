package chapter5;

public class p152_no1
{
    int age = 40;
    String name = "James";
    boolean marriage = true;
    int children = 3;
    public static void main(String[] args)
    {
        p152_no1 no1 = new p152_no1();

        System.out.println("나이 : " + no1.age);
        System.out.println("이름 : " + no1.name);
        System.out.println("결혼 여부 : " + no1.marriage);
        System.out.println("자녀 수 : " + no1.children);
    }
}
