package codeForces;
/*
   Problem Link
   https://codeforces.com/contest/102/problem/B
 */

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String n=scanner.next();
        long sum=0,counter=1;
        boolean check=true;
        if (n.length()<2)
        {
            System.out.println(0);
            return;
        }
        while (check)
        {
            for (int i=0;i<n.length();i++)
            {
                sum+=(n.charAt(i)-'0');
            }
            if (sum>9)
            {
                n= String.valueOf(sum);
                sum=0;
                counter++;
            }else
            {
                check=false;
            }
        }

        System.out.println(counter );
    }
}
