package codeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class NewArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int [] arrA=new int[size];
        int [] arrB=new int[size];
        for (int i=0;i<size;i++)
        {
            arrA[i]=scanner.nextInt();
        }
        for (int i=0;i<size;i++)
        {
            arrB[i]=scanner.nextInt();
        }
        doConcatenation(arrA,arrB,size);
    }

    private static void doConcatenation(int[] arrA, int[] arrB, int size) {
        ArrayList<Integer> store=new ArrayList<>();
        for (int i=0;i<size;i++)
        {
            store.add(arrB[i]);
        }
        for (int i=0;i<size;i++)
        {
            store.add(arrA[i]);
        }

        for (Integer value:store)
        {
            System.out.print(value+" ");
        }
    }
}
