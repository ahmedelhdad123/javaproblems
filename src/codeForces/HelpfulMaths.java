package codeForces;
/*
  Problem Link
  https://codeforces.com/contest/339/problem/A
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String store=scanner.next().replace("+","");
        StringBuilder newStore= new StringBuilder();
        boolean check=false;
        char [] sort=store.toCharArray();
        Arrays.sort(sort);
        for (int i=0;i<sort.length;i++)
        {
            if (store.length()<2)
            {
                check=true;
            }else
            {
                newStore.append(sort[i]).append("+");
                check=false;
            }
        }
        if (check==true)
        {
            System.out.println(store);
        }else
        {
            newStore = new StringBuilder(newStore.substring(0, newStore.length() - 1));
            System.out.println(newStore);
        }
    }
}
/*
        String x= scanner.nextLine();
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i=0;i<x.length();i++)
        {
            if (x.charAt(i) != '+')
            {
                arrayList.add(Character.getNumericValue(x.charAt(i)));
            }
        }
        Collections.sort(arrayList);
        String s="";
        for (int i=0;i<arrayList.size();i++)
        {
            s=s+arrayList.get(i);
            if(i!=arrayList.size()-1)
            {
                s+="+";
            }
        }
        System.out.println(s);
 */

