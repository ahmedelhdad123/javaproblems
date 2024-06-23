package codeForces;
/*

 Problem Link
 https://codeforces.com/contest/66/problem/B
 */
import java.util.ArrayList;
import java.util.Scanner;

public class PetyaAndCountryside {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int [] store=new int[size];
        int counter=1,temp=1;
        for (int i =0 ;i<size;i++)
        {
            store[i]=scanner.nextInt();
        }
        for (int i=0;i<size;i++) // 1 2 1 1 1 3 3 4
        {
            for (int j=i;j>0;j--)// 1 2 1 1 1 3 3 4
            {
                if (store[j]>=store[j-1])
                {
                    counter++;
                }else
                {
                    break;
                }
            }
            for (int z=i;z<size-1;z++)
            {
                if (store[z]>=store[z+1])
                {
                    counter++;
                }else
                {
                    break;
                }
            }
            if (temp<counter)
            {
                temp=counter;
            }
            counter=1;
        }
        System.out.println(temp);
    }
}
