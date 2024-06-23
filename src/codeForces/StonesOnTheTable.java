package codeForces;

import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nStone=scanner.nextInt();
        String line=scanner.next();
        char [] store=line.toCharArray();
        int count =0;
        for (int i=0;i<nStone-1;i++)
        {
            if (store[i]==store[i+1])
            {
                count++;
            }else
            {
                continue;
            }
        }
        System.out.println(count);

    }
}
/*
           int x=scan.nextInt();
            String a=scan.next();
            char b=a.charAt(0);
            int z=0;
            for(int i=1;i<x;i++)
            {
                if(b==a.charAt(i))
                {
                    z++;
                }
                b=a.charAt(i);
            }
            System.out.println(z);
 */
