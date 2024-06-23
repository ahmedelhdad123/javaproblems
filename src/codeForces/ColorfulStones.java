package codeForces;
//  Problem Link https://codeforces.com/contest/265/problem/A

import java.util.Scanner;

public class ColorfulStones {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line1=scanner.next();
        char [] storeLine1=line1.toCharArray();
        String line2=scanner.next();
        char [] storeLine2=line2.toCharArray();
        int count=0;
        int check=0;
        for (int i=0;i<line2.length();i++)
        {
             if (storeLine1[count]==storeLine2[i])
             {
                 count++;
             }
             if (count==storeLine2.length)
             {
                 break;
             }
        }
        System.out.println(count+1);


    }
}
/*
       String s=scann.next();
        String t=scann.next();

        int k=0;
        int count=1;
        for(int i=0;i<t.length();i++)
        {
            //RGB
            //RRR
            if(s.toCharArray()[k] == t.toCharArray()[i] ) {
                count++;
                k++;
            }


        }
        System.out.println(count);
 */
