

// Problem Link   https://codeforces.com/contest/344/problem/A

import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        char [] store=new char[number];
        int count=1;
        for (int i=0;i<store.length;i++)
        {
            store[i]=scanner.next().charAt(0);
        }
        for (int i=0;i<store.length-1;i++)
        {
            if (store[i]!=store[i+1])
            {
                count++;
            }else
            {
                continue;
            }
        }
        System.out.println(count);

    }
}
/*
           int a=scan.nextInt();
            int x=0,z=0;
            for(int i=0;i<a;i++) 5
            {
                int b=scan.nextInt(); 10 10 01 10 10
                if(b!=x)
                {
                    z++;
                    x=b;
                }
            }

            System.out.println(z);
 */
