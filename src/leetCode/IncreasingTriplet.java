package leetCode;
/*
   LeetCode ProblemLink
   https://leetcode.com/problems/increasing-triplet-subsequence/submissions/1239050106/?envType=study-plan-v2&envId=leetcode-75
 */
import java.util.Scanner;

public class IncreasingTriplet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] nums = new int[number];
        for (int i = 0; i < number; i++) {
            nums[i] = scanner.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= min) {
                min = num;
            } else if (num <= mid) {
                mid = num;
            } else {
                System.out.println("true");
            }
        }

        System.out.println("false");
    }
}
/*
  Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int [] nums=new int[number];
        for (int i=0;i<number;i++)
        {
            nums[i]=scanner.nextInt();
        }
        int count=1;
        for (int i=0;i<nums.length-1;i++)
        {
            if (nums[i]<nums[i+1])
            {
                count++;
                if (count>=3)
                {
                    break;
                }
            }else
            {
                count=1;
            }
        }
        System.out.println(count>=3? "ture":"false");
 */
