package codeForces;
/*
    Problem Link
    https://codeforces.com/contest/1/problem/A
 */
import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long a = scanner.nextLong();

        long x = (n + a - 1) / a;
        long y = (m + a - 1) / a;

        long result = x * y;

        System.out.println(result);

    }
}
