package codeForces;

import java.util.Scanner;

public class PrimeFunction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        while (size-->0)
        {
            int number=scanner.nextInt();
            System.out.println(isPrime(number));
        }

    }
    public static String isPrime(int number)
    {
        if (number <= 1) {
            return "NO";
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return "NO";
            }
        }
        return "YES";
    }
}
