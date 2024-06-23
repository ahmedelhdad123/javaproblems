package codeForces;
/*
    Problem Link
   https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/K
 */
import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        String number=scanner.next();
        int sum=0;
        int store[] =new int[size];
        for (int i=0;i<size;i++)
        {
            store[i]=number.charAt(i)-'0';
            sum+=store[i];
        }
        System.out.println(sum);
    }
}
