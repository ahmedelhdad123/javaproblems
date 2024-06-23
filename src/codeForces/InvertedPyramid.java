package codeForces;

import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        printInvertedPyramid(num, 0);
    }

    public static void printInvertedPyramid(int num, int spaces) {
        if (num == 0) {
            return;
        }
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 2 * num - 1; i++) {
            System.out.print("*");
        }
        System.out.println();
        printInvertedPyramid(num - 1, spaces + 1);
    }
}
