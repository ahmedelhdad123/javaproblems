package leetCode;
/*
    LeetCode Problem LInk
    https://leetcode.com/problems/product-of-array-except-self/submissions/1238268602/?envType=study-plan-v2&envId=leetcode-75
 */
import java.util.Scanner;

public class ProductExceptSelf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int []nums=new int[number];
        for (int i=0;i<nums.length;i++)
        {
            nums[i]=scanner.nextInt();
        }
        int [] store=new int [nums.length];
        for (int i=0;i<nums.length;i++)
        {
            int product=1;
            for (int j=0;j<nums.length;j++)
            {
                if (j==i)
                {
                    continue;
                }else
                {
                    product*=nums[j];
                }
            }
            store[i]=product;
        }
        for (int i=0;i<store.length;i++)
        {
            System.out.println(store[i]);
        }
    }
}
