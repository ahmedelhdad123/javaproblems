package codeForces;

import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean almostLucky = false;

        for (int i = 1; i <= n; i++) {
            if (isLucky(i) && n % i == 0) {
                almostLucky = true;
                break;
            }
        }

        if (almostLucky) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public static boolean isLucky(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 4 && digit != 7) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
