package codeForces;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();

        long gcd = findGCD(a, b);
        long lcm = findLCM(a, b, gcd);

        System.out.println(gcd + " " + lcm);

        scanner.close();
    }


    private static long findGCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static long findLCM(long a, long b, long gcd) {
        //return (a / gcd) * b;
        return a * b / gcd;
    }
}
