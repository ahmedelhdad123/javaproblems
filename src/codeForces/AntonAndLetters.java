package codeForces;// Problem Link
/*
   https://codeforces.com/contest/443/problem/A
 */

import java.util.HashSet;
import java.util.Scanner;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine().replaceAll(", ","");
       // System.out.println(line);
        HashSet <Character> store=new HashSet<>();
        for (int i=0;i< line.length();i++)
        {
            store.add(line.charAt(i));
        }
        int size=store.size()-2 < 0 ? 0 : store.size()-2;
        System.out.println(size);
    }
}
/*
        Scanner scanner=new Scanner(System.in);
        String  a= scanner.nextLine();
        Set<Character> set=new HashSet<>();
        for (int i=0;i<a.length();i++)
        {
            if(!(a.charAt(i)=='{'||a.charAt(i)=='}'||a.charAt(i)==' '||a.charAt(i)==','))
            {
                set.add(a.charAt(i));
            }
        }
        System.out.println(set.size());
 */
