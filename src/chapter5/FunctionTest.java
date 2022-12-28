package chapter5;
import java.util.Scanner;

public class FunctionTest
{
    int n1, n2, sum;
    char ch;
    public int pm(int a, int b, char c)
    {
        if (c == '+')
            return a + b;
        else if (c == '-')
            return a - b;
        else if (c == '*')
            return a * b;
        else
            return a / b;
    }
}