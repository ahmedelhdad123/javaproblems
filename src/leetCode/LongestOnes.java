package leetCode;
/*
  LeetCode ProblemLink
  https://leetcode.com/problems/max-consecutive-ones-iii/submissions/1257771660/?envType=study-plan-v2&envId=leetcode-75
 */
import java.util.Scanner;

public class LongestOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i, flips = k; j < nums.length; j++) {
                if (nums[j] == 1) {
                    count++;
                } else if (flips > 0) {
                    count++;
                    flips--;
                } else {
                    break;
                }
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
