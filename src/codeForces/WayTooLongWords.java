package codeForces;
/*
  Problem Link
  https://codeforces.com/contest/71/problem/A
 */

import java.util.ArrayList;
import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOfWord= scanner.nextInt();
        for (int i=0;i<numberOfWord;i++)
        {
            String word=scanner.next();
            if (word.length()>10)
            {
                System.out.print(word.charAt(0));
                System.out.print(word.length()-2);
                System.out.print(word.charAt(word.length()-1));
                System.out.println();
            }else
            {
                System.out.println(word);
            }
        }
    }
}
/*
        int x=scanner.nextInt();
        ArrayList<String> arrayList =new ArrayList<String>();
        for(int i=0;i<x;i++)
        {
            String a=scanner.next();
            if(a.length()<=10)
            {
                arrayList.add(a);
            }else
            {
                int e=a.length()-2;
                char b=a.charAt(0);
                char c=a.charAt(a.length()-1);
                String d= Character.toString(b) +Integer.toString(e) + Character.toString(c);
                arrayList.add(d);
            }
        }
        for (int i=0;i<arrayList.size();i++)
        {
            System.out.println(arrayList.get(i));
        }
 */
