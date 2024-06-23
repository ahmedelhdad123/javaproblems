package codeForces;

import java.util.Scanner;

public class PrintDigitsUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        while (n-->0)
        {
            String store=scanner.next();
            printDigitsUsingRecursion(store);
            System.out.println();

        }
    }

    private static void printDigitsUsingRecursion(String store) {
        if (store.isEmpty()){
            return;
        }
        System.out.print(store.charAt(0)+" ");
        printDigitsUsingRecursion(store.substring(1));

    }
}
