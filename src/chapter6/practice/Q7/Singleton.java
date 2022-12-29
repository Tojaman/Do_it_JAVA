package chapter6.practice.Q7;

public class Singleton
{
    // 인스턴스 생성을 외부에서 못하고 내부 함수를 이용해서 할 수 있도록 private 걸어줌
    private static Singleton instance = new Singleton();
    private Singleton() {}

    public static Singleton getInstance()
    {
        // 인스턴스가 생성되지 않았을 때 최초 인스턴스 생성
        // 만약 인스턴스가 생성되어 있다면 기존의 인스턴스 리턴
        // 즉, 인스턴스는 오직 하나만 생성할 수 있음(싱글톤)
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
