package chapter6.practice.Q7;

public class SingletonTest
{
    public static void main(String[] args) {
        // �ν��Ͻ��� �� �� �����Ѵ�.
        Singleton st1 = Singleton.getInstance();
        Singleton st2 = Singleton.getInstance();

        // ���� �� �ν��Ͻ��� ���ٸ� true, �ٸ��ٸ� false ���
        System.out.println(st1 == st2); // true ���
    }
}

