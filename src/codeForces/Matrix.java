package codeForces;
/*
    Problem Link
    https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/T
 */
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] store = new int[size][size];
        int sumF=0,sumS=0;
        for (int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                store[i][j]=scanner.nextInt();
            }
        }
        for (int i=0;i<size;i++)
        {

               sumF+= store[i][i];

        }
        for (int i=0;i<size;i++)
        {

            sumS+= store[i][size- 1 - i];

        }
        System.out.println(Math.abs(sumF-sumS));

    }
}
