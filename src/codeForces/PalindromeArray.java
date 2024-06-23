package codeForces;

import java.util.Scanner;

public class PalindromeArray {
    static int[] arr;
    static int size;

    public static boolean plin(int index) {
        if (index == size) {
            return true;
        }
        return (arr[index] == arr[size - index - 1]) && plin(index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        if (plin(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
