package codeForces;
/*
   Problem LInk
   https://codeforces.com/group/MWSDmqGsZm/contest/219432/problem/N
 */
import java.util.Scanner;

public class NumbersHistogram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char shape=scanner.next().charAt(0);
        int size=scanner.nextInt();
        while (size-->0)
        {
            int number=scanner.nextInt();
            for (int i=0;i<number;i++)
            {
                System.out.print(shape);
            }
            System.out.println();
        }
    }
}
