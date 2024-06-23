package leetCode;
/*
   LeetCode Problem Link
   https://leetcode.com/problems/container-with-most-water/submissions/1254519468/?envType=study-plan-v2&envId=leetcode-75
 */
import java.util.Scanner;

public class MaxArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] height= new int[n];
        int area = 0;
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        int left = 0, right = height.length-1;
        while (left < right) {
            if (height[left] <= height[right]) {
                area=Math.max(area, height[left]*(right-left));
                left++;
            }else
            {
                area=Math.max(area, height[right]*(right-left));
                right--;
            }
        }
        System.out.println(area);
    }
}
