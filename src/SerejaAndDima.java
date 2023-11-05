
// Problem Link   https://codeforces.com/contest/381/problem/A

import java.util.Arrays;
import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        int [] store=new int[number];
        int sumS=0 , sumD=0;
        int first=0 ,last=store.length-1;
        for (int i=0;i<number;i++)
        {
            store[i]=scanner.nextInt();
        }
        boolean check=true;
        while (first<=last)
        {
            if (store[first]>=store[last])
            {
                if (check)
                {
                    sumS+=store[first];
                }else
                {
                    sumD+=store[first];
                }
                first++;
            } else if (store[first]<store[last]) {
                if (check)
                {
                    sumS+=store[last];
                }else
                {
                    sumD+=store[last];
                }
                last--;
            }
            if (check)
            {
                check=false;
            }else
            {
                check=true;
            }
        }

        System.out.println(sumS + " " + sumD);

    }
}
