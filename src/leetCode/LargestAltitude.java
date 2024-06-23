package leetCode;
/*
  LeetCode Problem Link
  https://leetcode.com/problems/find-the-highest-altitude/submissions/1259559665/?envType=study-plan-v2&envId=leetcode-75
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LargestAltitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] gain = new int[n];
        for (int i = 0; i < n; i++) {
            gain[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = i-1; j >= 0; j--) {
                sum+=gain[j];
            }
            list.add(sum);
        }
        list.add(gain[n-1]+list.get(n-1));
        int max= Collections.max(list);
        System.out.println(max);
    }
}
