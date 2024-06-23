package codeForces;

import java.util.Scanner;

public class Pyramid {
    static int input;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        input = num;
        print(num);
    }

    public static void print(int num) {
        if (num == 0) {
            return;
        }
        print(num - 1);
        for (int i = 1; i <= input - num; i++) {
            System.out.print(" ");
        }
        for (int i = 1; i <= num * 2 - 1; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
