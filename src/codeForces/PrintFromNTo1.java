package codeForces;

import java.util.Scanner;

public class PrintFromNTo1 {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();
            printFromNTo1(n);
    }

    private static void printFromNTo1(int n) {
        if (n <= 0){
            return;
        }

        System.out.print(n);
        if (n > 1 )
        {
            System.out.print(" ");
        }
        printFromNTo1(n-1);

    }
}
