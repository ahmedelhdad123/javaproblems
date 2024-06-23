package codeForces;

import java.util.Scanner;

public class MaxAndMIN {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int [] store=new int[size];
        for (int i = 0; i < size; i++) {
            store[i] = scanner.nextInt();
        }
        System.out.println(Min(store) + " " + Max(store));
    }

    private static int Max(int[] store) {
        int temp=Integer.MIN_VALUE;
        for (int i=0;i<store.length;i++)// 10 13 95 1 3
        {
            if (temp<store[i])
            {
                temp=store[i];
            }
        }
        return temp;
    }

    private static int Min(int[] store) {
        int temp=Integer.MAX_VALUE;
        for (int i=0;i<store.length;i++)// 10 13 95 1 3
        {
            if (temp>store[i])
            {
                temp=store[i];
            }
        }
        return temp;
    }
}
