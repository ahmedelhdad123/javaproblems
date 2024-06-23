package codeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String store = scanner.next();
        String check= String.valueOf(store.charAt(0));
       for (int i=0;i<size-1;i++)
       {
           if (store.charAt(i)!=store.charAt(i+1))
           {
               check=check+store.charAt(i);
           }
       }
        System.out.println(check.length());
    }
}
