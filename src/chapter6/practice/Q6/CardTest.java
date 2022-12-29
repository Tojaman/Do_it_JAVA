package chapter6.practice.Q6;

public class CardTest
{
    public static void main(String[] args) {
        System.out.println("클래스 직접 참조(static 변수) : " + Card.cardNum); // 클래스를 직접 참조
        System.out.println("클래스 직접 참조(static 함수) : " + Card.getCardNum()); // 클래스를 직접 참조

        Card card1 = new Card();
        System.out.println("card1 : " + card1.cardNum);
        System.out.println("card1 : " + card1.getCardNum());
        System.out.println("card1 클래스 직접 참조(static 변수) : " + Card.cardNum); // 클래스를 직접 참조
        System.out.println("card1 클래스 직접 참조(static 함수) : " + Card.getCardNum()); // 클래스를 직접 참조
        System.out.println("card1 고객 카드 번호 : " + card1.ctmCardNum);

        Card card2 = new Card();
        System.out.println("card2 : " + card2.cardNum);
        System.out.println("card2 : " + card2.getCardNum());
        System.out.println("card2 클래스 직접 참조(static 변수) : " + Card.cardNum); // 클래스를 직접 참조
        System.out.println("card2 클래스 직접 참조(static 함수) : " + Card.getCardNum()); // 클래스를 직접 참조
        System.out.println("card2 고객 카드 번호 : " + card2.ctmCardNum);
    }
}
