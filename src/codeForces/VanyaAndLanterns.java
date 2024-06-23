package codeForces;
/*
     Problem Link
     https://codeforces.com/contest/492/problem/B
 */
import java.util.*;

public class VanyaAndLanterns {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lanterns=scanner.nextInt();
        int length =scanner.nextInt();
        int [] located=new int[lanterns];
        int max=Integer.MIN_VALUE;
        double result=0.0;
        boolean f1 = false, f2 = false;
        for (int i=0;i<lanterns;i++)
        {
             located[i]=scanner.nextInt();
             if (located[i]==0) f1=true;
             if (located[i]==length) f2=true;
        }
        Arrays.sort(located);
        for (int i=0 ; i<lanterns-1;i++)
        {
            max=Math.max(max,located[i+1]-located[i]);
        }
        result= (double) max /2;

        if (!f1) result=Math.max(result,(double) located[0]);
        if (!f2) result=Math.max(result,(double) length-located[lanterns-1]);

        System.out.println(result);
    }
}
