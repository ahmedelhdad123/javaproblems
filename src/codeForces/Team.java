package codeForces;
// Problem Link https://codeforces.com/contest/231/problem/A
import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int [][] store= new int[number][3];
        int countEnter=0;
        int countOut=0;
        for (int i=0;i<number;i++)
        {
            for (int j=0;j<3;j++)
            {
                store[i][j]=scanner.nextInt();
                if (store[i][j]==1)
                {
                    countEnter++;
                }
            }
            if (countEnter>=2)
            {
                countOut++;
            }
            countEnter=0;
        }
        System.out.println(countOut);
    }
}
// another solution

//    long x=scan.nextLong();
//    int count=0;
//        for(int i=0; i<x;i++)
//        {
//        long y=scan.nextLong();
//        long a=scan.nextLong();
//        long b=scan.nextLong();
//        if(y+a+b>=2)
//        {
//        count++;
//        }
//        }
//        System.out.println(count);

