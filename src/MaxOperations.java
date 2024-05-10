
/*
   LeetCode Problem LInk
   https://leetcode.com/problems/max-number-of-k-sum-pairs/submissions/1254587885/?envType=study-plan-v2&envId=leetcode-75
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
            list.add(nums[i]);
        }
        int k = sc.nextInt();
        int operation = 0;
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) > k) {
                i++;
                continue;
            }
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) > k) {
                    continue;
                }
                if ((list.get(i) + list.get(j)) == k) {
                    operation++;
                    list.remove(j);
                    break;
                }
            }
            i++;
        }
        System.out.println(operation);
    }
}
