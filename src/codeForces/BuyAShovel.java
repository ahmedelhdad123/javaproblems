package codeForces;
// Problem Link  https://codeforces.com/contest/732/problem/A

import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int k=scanner.nextInt();
        int r=scanner.nextInt();
        int count=0;
        int mul=1;
        for (int i=1;i<10;i++)
        {
            mul=i*k;
            if (mul%10==r||mul%10==0)
            {
                count++;
                break;
            }else
            {
                count++;
            }
            mul=0;
        }
        System.out.println(count);
    }
}
/*
        int k=scann.nextInt();
        int r=scann.nextInt();
        int mul=0;
        int count=0;

        while (true)
        {
            count++;
            mul=k*count;
            if((mul%10 == r) || (mul%10 == 0) )
            {
                break;
            }
        }
        System.out.println(count);
 */
