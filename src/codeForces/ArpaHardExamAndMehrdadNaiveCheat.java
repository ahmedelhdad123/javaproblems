package codeForces;
//Problem Link http://codeforces.com/contest/742/problem/A

import java.util.Scanner;

public class ArpaHardExamAndMehrdadNaiveCheat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int [] store={8,4,2,6};
        if (n==0)
        {
            System.out.println("1");
        } else if (n>0) {
            n=(n-1)%4;
            System.out.println(store[n]);
        }
    }
}
