package leetCode;
/*
   LeetCode Problem Link
   https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/?envType=study-plan-v2&envId=leetcode-75
 */
import java.util.Scanner;

public class LongestSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i,k=1; j < nums.length; j++) {
                if (nums[j]==1)
                {
                    count++;
                } else if (nums[j]==0&&k==1) {
                    k--;
                }else
                {
                    break;
                }
            }
            max = Math.max(max,count);
        }
        if (max==nums.length)
        {
            max--;
        }
        System.out.println(max);
    }
}
