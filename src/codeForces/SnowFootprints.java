package codeForces;
/*
  Problem Link
  https://codeforces.com/contest/298/problem/A
 */

import java.util.Scanner;

public class SnowFootprints {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        char [] character=scanner.next().toCharArray();
        int first=0,last=0;
        for (int i=0;i<size;i++)
        {
            if (character[i]!='.')
            {
               first=i;
               break;
            }
        }
        for (int i=size-1;i>=0;i--)
        {
            if (character[i]!='.')
            {
                last=i;
                break;
            }
        }
        if (character[first]=='R'&&character[last]=='R')
        {
            System.out.println((first+1) + " " + (last+2));
        } else if (character[first]=='L'&&character[last]=='L') {
            System.out.println((last+1) + " " + first);
        }else if (character[first]=='R'&&character[last]=='L')
        {
            for (int i=first;i<size;i++)
            {
                last=i;
                if (character[i]=='L')
                {
                    break;
                }
            }
            System.out.println((first+1) + " " + (last));
        }
    }
}
