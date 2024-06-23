package codeForces;
/*
    Problem Link
    https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/Y
 */
import java.util.Scanner;

public class RangeSumQuery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int sizeS = scanner.nextInt();
        long[] store = new long[size];
        long[] prefixSum = new long[size];

        // Input array elements
        for (int i = 0; i < size; i++) {
            store[i] = scanner.nextInt();
            if (i == 0) {
                prefixSum[i] = store[i];
            } else {
                prefixSum[i] = prefixSum[i - 1] + store[i];
            }
        }

        // Process range sum queries
        while (sizeS-- > 0) {
            long num1 = scanner.nextLong() - 1;
            long num2 = scanner.nextLong() - 1;

            // Calculate sum using prefix sums
            long sum = (num1 == 0) ? prefixSum[(int) num2] : prefixSum[(int) num2] - prefixSum[(int) (num1 - 1)];
            System.out.println(sum);
        }
    }
}
