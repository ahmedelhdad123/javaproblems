
// Problem Link  https://codeforces.com/contest/294/problem/A

import java.util.Scanner;

public class ShaassAndOskols {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int [] store=new int[number];
        for (int i=0;i<number;i++)
        {
            store[i]=scanner.nextInt();
        }
        int shoot=scanner.nextInt();
        for (int i=0;i<shoot;i++)
        {
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            --x;
            if (x != 0)
            {
                store[x-1]+=y-1;
            }
            if (x != number-1)
            {
                store[x+1]+=store[x]-y;
            }
            store[x]=0;
        }
        for (int i=0;i<number;i++)
        {
            System.out.println(store[i]);
        }
    }
}
