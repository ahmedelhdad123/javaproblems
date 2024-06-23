package codeForces;
/*
    Problem Link
      https://codeforces.com/contest/579/problem/A
 */

import java.util.Scanner;

public class RaisingBacteria {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int bacteria=scanner.nextInt();
        int result=0;
        while (bacteria>0)
        {
            if (bacteria%2==1)
            {
                result++;
            }
            bacteria /=2;
        }
        System.out.println(result);
    }
}
