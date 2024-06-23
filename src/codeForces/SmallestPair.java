package codeForces;
/*
  Problem Link
  https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/I
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SmallestPair {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();

        while (number-->0)
        {
            int size=scanner.nextInt();
            int [] store=new int[size];
            int result=0,min=Integer.MAX_VALUE;
            for (int i=0;i<size;i++)
            {
                store[i]=scanner.nextInt();
            }
            for (int i=1;i<size;i++)
            {
                for (int j=i+1;j<=size;j++)
                {
                    result=(store[i-1]+store[j-1]+(j-i));
                    if (result<min)
                    {
                        min=result;
                    }
                }
            }
            System.out.println(min);
        }
    }
}
