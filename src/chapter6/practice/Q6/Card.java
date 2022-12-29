package chapter6.practice.Q6;

public class Card
{
    static int cardNum = 1000;
    int ctmCardNum;

    public Card()
    {
        cardNum++;
        ctmCardNum = cardNum;
    }
    public static int getCardNum() {return cardNum;}

}
