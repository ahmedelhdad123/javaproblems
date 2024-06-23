package leetCode;
/*
   LeetCode Problem Link
   https://leetcode.com/problems/move-zeroes/submissions/1253678862/?envType=study-plan-v2&envId=leetcode-75
 */
import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int [] store=new int[n];
        for (int i=0;i<n;i++)
        {
            store[i]=scanner.nextInt();
        }
        if (store.length<=1)
        {
            System.out.println(store[0]);
        }
        for (int i=0;i<n;i++) // 5 0 1 2 3
        {
            if (store[i] == 0) { // 1 0 2 3
                for (int j = i + 1; j < n; j++) {
                    if (store[j] != 0) {
                        int temp = store[i];
                        store[i] = store[j];
                        store[j] = temp;
                        break;
                    }
                }
            }
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(store[i]+" ");
        }
    }
}
