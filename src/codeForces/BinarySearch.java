package codeForces;
/*
    Problem Link
    https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/Z
 */
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int size = scanner.nextInt();
        int sizeF = scanner.nextInt();
        int[] store = new int[size];
        for (int i = 0; i < size; i++) {
            store[i] = scanner.nextInt();
        }

        Arrays.sort(store);

        while (sizeF-- > 0) {
            int num = scanner.nextInt();

            int result = binarySearch(store, num);

            if (result != -1) {
                System.out.println("found");
            } else {
                System.out.println("not found");
            }
        }
    }

    private static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
