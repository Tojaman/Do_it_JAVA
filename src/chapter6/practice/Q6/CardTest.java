package chapter6.practice.Q6;

public class CardTest
{
    public static void main(String[] args) {
        System.out.println("Ŭ���� ���� ����(static ����) : " + Card.cardNum); // Ŭ������ ���� ����
        System.out.println("Ŭ���� ���� ����(static �Լ�) : " + Card.getCardNum()); // Ŭ������ ���� ����

        Card card1 = new Card();
        System.out.println("card1 : " + card1.cardNum);
        System.out.println("card1 : " + card1.getCardNum());
        System.out.println("card1 Ŭ���� ���� ����(static ����) : " + Card.cardNum); // Ŭ������ ���� ����
        System.out.println("card1 Ŭ���� ���� ����(static �Լ�) : " + Card.getCardNum()); // Ŭ������ ���� ����
        System.out.println("card1 �� ī�� ��ȣ : " + card1.ctmCardNum);

        Card card2 = new Card();
        System.out.println("card2 : " + card2.cardNum);
        System.out.println("card2 : " + card2.getCardNum());
        System.out.println("card2 Ŭ���� ���� ����(static ����) : " + Card.cardNum); // Ŭ������ ���� ����
        System.out.println("card2 Ŭ���� ���� ����(static �Լ�) : " + Card.getCardNum()); // Ŭ������ ���� ����
        System.out.println("card2 �� ī�� ��ȣ : " + card2.ctmCardNum);
    }
}
