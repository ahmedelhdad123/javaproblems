package codeForces;
// Problem Link  https://codeforces.com/contest/263/problem/A

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for (int i=1;i<=5;i++) {
            for (int j = 1; j <= 5; j++)
            {
                int number=scanner.nextInt();
                if (number==1)
                {
                    System.out.println(Math.abs(i-3)+Math.abs(j-3));
                    break;
                }
            }
        }
    }

}
/*
int [][] store=new int[5][5];
        int count=0;
        for (int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                store[i][j]=scanner.nextInt();
                if(store[i][j]==1)
                {
                    count+=Math.abs(i-2)+Math.abs(j-2);
                    break;
                }
            }
        }
        System.out.println(count);
 */
