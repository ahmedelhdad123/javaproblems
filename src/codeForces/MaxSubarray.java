package codeForces;

import java.util.Scanner;

public class MaxSubarray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        while (number-->0)
        {
            int size=scanner.nextInt();
            int []store=new int[size];
            for (int i=0;i<size;i++)
            {
                store[i]=scanner.nextInt();
                System.out.print(store[i]+ " ");
            }
            int i=0;
            int z=0;
            int max=0;
            while (true)
            {
                if (z==size-1)
                {
                    break;
                }
                if (i==z)
                {
                    max=Math.max(store[i],store[i+1]);
                }else
                {
                    max=Math.max(max,store[i+1]);
                }
                System.out.print(max+ " ");
                i++;
                if (i==size-1)
                {
                    z++;
                    i=z;
                }
            }
            System.out.println();

        }
    }
}
