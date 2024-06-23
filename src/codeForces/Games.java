package codeForces;
// Problem Link  https://codeforces.com/contest/268/problem/A

import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numTeam=scanner.nextInt();
        int []storeG=new int[numTeam];
        int []storeH=new int[numTeam];
        int count=0;

        for (int i=0;i<numTeam;i++)
        {
            storeH[i]=scanner.nextInt();
            storeG[i]=scanner.nextInt();
        }
        for (int i=0;i<storeH.length;i++) {
            for (int j=0;j<storeG.length;j++)
            {
                if (storeH[i]==storeG[j])
                {
                    count++;
                }
            }

        }

        System.out.println(count);
    }
}
