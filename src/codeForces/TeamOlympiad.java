package codeForces;
/*
  Problem Link
  https://codeforces.com/contest/490/problem/A
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TeamOlympiad {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOfStudent=scanner.nextInt();
        int [] store=new int[numberOfStudent];
        List t1=new ArrayList<>();
        List t2=new ArrayList<>();
        List t3=new ArrayList<>();
        for (int i=0;i<numberOfStudent;i++)
        {
            store[i]=scanner.nextInt();
            if (store[i]==1)
            {
                t1.add(i);
            } else if (store[i]==2) {
                t2.add(i);
            }else
            {
                t3.add(i);
            }
        }
        int min=Math.min(t1.size(),Math.min(t2.size(), t3.size()));
        System.out.println(min);
        for (int i=0;i<min;i++)
        {
            System.out.println(t1.get(i)+" "+t2.get(i)+" "+t3.get(i));
        }
    }
}
