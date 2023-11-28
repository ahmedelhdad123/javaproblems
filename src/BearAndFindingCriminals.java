
/*
    Problem Link
    https://codeforces.com/contest/680/problem/B
 */

import java.util.Scanner;

public class BearAndFindingCriminals {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int position=scanner.nextInt();
        int [] store=new int[size];
        int sum=0;
        for (int i=0;i<size;i++)
        {
            store[i]=scanner.nextInt();
            sum+=store[i];
        }
        int realPosition=position-1;
        if (size<2)
        {
            if (store[realPosition]==1)
            {
                System.out.println(1);
            }else
            {
                System.out.println(0);
            }
        }else
        {
            int j =realPosition-1;
            for (int i=realPosition+1; i<size;i++)
            {
                if (j>=0)
                {
                    if (store[i]+store[j]!=2)
                    {
                        sum-=store[i]+store[j];
                    }
                    j--;
                }else
                {
                    break;
                }
            }
                System.out.println(sum);
        }

    }
}
