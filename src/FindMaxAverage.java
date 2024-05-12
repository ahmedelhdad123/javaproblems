
/*
  LeetCode Problem Link
  https://leetcode.com/problems/maximum-average-subarray-i/submissions/1255573148/?envType=study-plan-v2&envId=leetcode-75
 */
import java.util.Scanner;

public class FindMaxAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        double result = Integer.MIN_VALUE;
        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += nums[j];
            }
            double avg = (double) sum / k;
            result = Math.max(result, avg);
        }
        System.out.println(result);
    }
}
