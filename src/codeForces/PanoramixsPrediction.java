package codeForces;
/*
   Problem Link
   https://codeforces.com/contest/80/problem/A
 */
import java.util.Scanner;

public class PanoramixsPrediction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstPrime = scanner.nextInt();
        int secondPrime = scanner.nextInt();
        int result = secondPrime - firstPrime - 1;
        int count = 0;
        boolean f1 = isPrime(firstPrime);
        boolean f2 = isPrime(secondPrime);

        if (!f1 || !f2) {
            System.out.println("NO");
        } else {
            for (int i = firstPrime + 1; i < secondPrime; i++) {
                if (isPrime(i)) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
