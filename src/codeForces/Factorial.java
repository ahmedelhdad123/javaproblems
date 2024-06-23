package codeForces;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long number=scanner.nextLong();
        System.out.println(factorial(number));
    }

    private static long factorial(long number) {
        if (number==1)
        {
            return 1;
        }
        return number*factorial(number-1);
    }
}
