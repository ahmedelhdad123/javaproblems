package codeForces;

import java.util.Scanner;

public class Accident {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] store = new int[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            store[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (store[i] == 0) { // 1
                for (int j = i - 1; j >= 0; j--) {
                    if (store[j] != store[i]) {
                        count++;
                    }
                }
            } else {
                for (int j = i + 1; j < size; j++) {
                    if (store[j] != store[i]) {
                        count++;
                    }
                }
            }
        }

            System.out.println(count);
    }
}
