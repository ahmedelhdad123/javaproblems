package codeForces;

import java.util.Scanner;

public class Divisability {
    public static long sum(long n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        long c = scanner.nextLong();

        long ma = Math.max(num1, num2);
        long mi = Math.min(num1, num2);

        System.out.println((sum(ma / c) * c) - (sum((mi - 1) / c) * c));
    }
}
