package chapter5;

public class p152_no2
{
    long order_num = 201803120001l;
    String ID = "abc123";
    String date = "2018년 3월 12일";
    String name = "홍길순";
    String prod_num = "PD0345-12";
    String address = "서울시 영등포구 여의도동 20번지";

    public static void main(String[] args)
    {
        p152_no2 no2 = new p152_no2();

        System.out.println("주문 번호 : " + no2.order_num);
        System.out.println("주문자 아이디 : " + no2.ID);
        System.out.println("주문 날짜 :" + no2.date);
        System.out.println("주문자 이름 : " + no2.name);
        System.out.println("주문 상품 번호 : " + no2.prod_num);
        System.out.println("배송 주소 : " + no2.address);
    }
}
