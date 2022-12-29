package chapter6.practice.Q7;

public class SingletonTest
{
    public static void main(String[] args) {
        // 인스턴스를 두 개 생성한다.
        Singleton st1 = Singleton.getInstance();
        Singleton st2 = Singleton.getInstance();

        // 만약 두 인스턴스가 같다면 true, 다르다면 false 출력
        System.out.println(st1 == st2); // true 출력
    }
}

