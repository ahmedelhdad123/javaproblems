package codeForces;/*
Problem Link
 https://codeforces.com/contest/365/problem/A
 */
import java.util.Scanner;

public class GoodNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ret = -1;
        String store = "0123456789";
        int n, k, count = 0, goodOperation = 0;

        n = scanner.nextInt();
        k = scanner.nextInt();

        while (n-- > 0) {
            String line = scanner.next();
            for (int i = 0; i <= k; i++) {
                ret = line.indexOf(store.charAt(i));
                if (ret != -1) {
                    count++;
                }
            }
            if (count >= k + 1) {
                goodOperation++;
            }

            count = 0;
        }

        System.out.println(goodOperation);
    }
}

