package codeForces;
//  Problem Link  https://codeforces.com/contest/236/problem/A


import java.util.HashSet;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line= scanner.next();
        HashSet<Character> store=new HashSet<>();
        for (int i=0;i<line.length();i++)
        {
            store.add(line.charAt(i));
        }

        if (store.size()%2==0)
        {
            System.out.println("CHAT WITH HER!");
        }else
        {
            System.out.println("IGNORE HIM!");
        }
    }
}
/*
   String a=scan.next();
        String temp="";
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            if(!temp.contains(String.valueOf(a.charAt(i))))
            {
                temp+=a.charAt(i);
                count++;
            }
            else
            {
                continue;
            }
        }
        if(count%2==0)
        {
            System.out.println("CHAT WITH HER!");
        }
        else
        {
            System.out.println("IGNORE HIM!");
        }
 */
