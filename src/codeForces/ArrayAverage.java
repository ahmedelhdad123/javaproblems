package codeForces;

import java.util.Scanner;

public class ArrayAverage {
    static double average;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] store = new int[number];

        for (int i = 0; i < number; i++) {
            store[i] = scanner.nextInt();
        }

        average = arrayAverage(store, 0);
        System.out.printf("%.6f%n", average);
    }

    private static double arrayAverage(int[] store, int i) {
        if (i == store.length) {
            return average / store.length;
        }
        average += store[i];
        return arrayAverage(store, i + 1);
    }
}
