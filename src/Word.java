
//  Problem Link    https://codeforces.com/contest/59/problem/A

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word= scanner.next();
        int countL=0;
        int countU=0;
        for (int i=0;i<word.length();i++)
        {
            if (word.charAt(i)>='a')
            {
                countL++;
            }else
            {
                countU++;
            }
        }
        if (countL>=countU)
        {
            System.out.println(word.toLowerCase());
        }else
        {
            System.out.println(word.toUpperCase());
        }
    }
}
/*
        String a=scan.next();
        char []x=a.toCharArray();
        int u=0,l=0;
        for(int i=0;i<a.length();i++)
        {
            if(Character.isUpperCase(x[i]))
            {
                u++;
            }else
            {
                l++;
            }
        }
        if(l>=u)
        {
            a=a.toLowerCase();
            System.out.println(a);
        }
        else
        {
            a=a.toUpperCase();
            System.out.println(a);
        }
 */
