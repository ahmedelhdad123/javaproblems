
/*
     Problem Link
     https://codeforces.com/contest/363/problem/B
 */

import java.util.Scanner;

public class Fence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int[] store = new int[n];
        int sum = 0, min = Integer.MAX_VALUE, temp = 0;

        for (int i = 0; i < n; i++) {
            store[i] = scanner.nextInt();
        }

        for (int i = 0; i < h; i++) {
            sum += store[i];
        }
        min = sum;


        // Update sum without recomputing the entire subarray
        for (int i = h; i < n; i++) {
            sum = sum - store[i - h] + store[i];
            if (sum < min) {
                min = sum;
                temp = i - h + 1;
            }
        }

        System.out.println((temp + 1));
    }
}
