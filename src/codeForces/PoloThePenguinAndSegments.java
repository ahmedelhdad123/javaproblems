package codeForces;
/*
   Problem Link
   https://codeforces.com/contest/289/problem/A
 */
import java.util.Arrays;
import java.util.Scanner;

public class PoloThePenguinAndSegments {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int top=scanner.nextInt();
        int result=0;
        int count =0;
        int [] store=new int[size*2];
        while (size-->0)
        {
            int l=scanner.nextInt();
            int r=scanner.nextInt();
            result+=(r-l)+1;
        }
        boolean check=true;
        while (check)
        {
            if (result%top==0)
            {
                check=false;
            }else
            {
                result++;
                count++;
            }
        }
        System.out.println(count);

    }
}
