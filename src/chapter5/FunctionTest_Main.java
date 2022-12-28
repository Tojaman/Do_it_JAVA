package chapter5;

import java.util.Scanner;

public class FunctionTest_Main
{
    public static void main(String[] args)
    {
        FunctionTest test = new FunctionTest();

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요");
        test.n1 = sc.nextInt();
        System.out.println("두번째 숫자를 입력하세요");
        test.n2 = sc.nextInt();
        System.out.println("연산자를 입력하세요");
        String st = sc.next();
        test.ch = st.charAt(0);
        test.sum = test.pm(test.n1, test.n2, test.ch);
        System.out.println("사칙연산 정답 : " + test.sum);
    }
}
