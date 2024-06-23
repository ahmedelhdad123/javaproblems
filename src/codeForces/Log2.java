package codeForces;

import java.util.Scanner;

public class Log2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long number=scanner.nextLong();
        System.out.println(doOperation(number));
    }

    private static long doOperation(long number) {
        if (number<=1)
        {
            return 0;
        }
        return 1+doOperation(number/2);
    }
}
