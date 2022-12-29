package chapter6.practice.Q7;

public class Singleton
{
    // �ν��Ͻ� ������ �ܺο��� ���ϰ� ���� �Լ��� �̿��ؼ� �� �� �ֵ��� private �ɾ���
    private static Singleton instance = new Singleton();
    private Singleton() {}

    public static Singleton getInstance()
    {
        // �ν��Ͻ��� �������� �ʾ��� �� ���� �ν��Ͻ� ����
        // ���� �ν��Ͻ��� �����Ǿ� �ִٸ� ������ �ν��Ͻ� ����
        // ��, �ν��Ͻ��� ���� �ϳ��� ������ �� ����(�̱���)
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
