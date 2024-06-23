package codeForces;
/*
     Problem Link
     https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/O
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        ArrayList<Long> store=new ArrayList<>();
        store.add(0L);
        store.add(1L);
        if (size==1)
        {
            System.out.println(0);
        }else if (size==2)
        {
            System.out.println(1);
        }else {
            for (int i=0;i<=size;i++)
            {
                store.add(store.get(i)+store.get(i+1));
                if (store.size()==size)
                {
                    break;
                }
            }
            System.out.println(store.get(size-1));
        }
    }
}
