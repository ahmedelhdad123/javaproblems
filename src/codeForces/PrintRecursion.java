package codeForces;

import java.util.Scanner;

public class PrintRecursion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        loveRecursion(n);

    }

    private static void loveRecursion(int n) {
        if (n <= 0){
            return;
        }
        System.out.println("I love Recursion");
        loveRecursion(n-1);
    }
}
