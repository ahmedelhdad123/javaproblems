
/*
   LeetCode Problem Link
   https://leetcode.com/problems/merge-sorted-array/
 */
import java.util.Arrays;
import java.util.Scanner;

public class MergeSortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] nums1 = new int[m];
        int[] nums2 = new int[n];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            nums2[i] = scanner.nextInt();
        }
//        nums1=Arrays.copyOf(nums1,m+n);
//        System.arraycopy(nums2,0,nums1,m,n);
//        Arrays.sort(nums1);
//

        mergeArrays(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void mergeArrays(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = Arrays.copyOf(nums1, m);

        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (temp[i] <= nums2[j]) {
                nums1[k++] = temp[i++];
            } else {
                nums1[k++] = nums2[j++];
            }
        }

        while (i < m) {
            nums1[k++] = temp[i++];
        }

        while (j < n) {
            nums1[k++] = nums2[j++];
        }
    }
}
