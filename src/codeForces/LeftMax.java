package codeForces;

import java.util.Scanner;

public class LeftMax {
    static int max=Integer.MIN_VALUE;
    static int number;
    static int [] store;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();
        store=new int[number];
        for (int i=0;i<number;i++)
        {
            store[i]=scanner.nextInt();
        }
        leftMax(0);
        for (int i=0;i<number;i++)
        {
            System.out.print(store[i]+ " ");
        }

    }

    private static int [] leftMax( int i) {
        if (i==store.length)
        {
            return store;
        }
        if (max<store[i])
        {
            max=store[i];
        }else
        {
            store[i]=max;
        }
        return leftMax(i+1);
    }

}
