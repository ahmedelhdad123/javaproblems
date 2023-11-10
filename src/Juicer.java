
// Problem Link  https://codeforces.com/contest/709/problem/A

import java.util.Scanner;

public class Juicer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberP=scanner.nextInt();
        int sizeP=scanner.nextInt();
        int sizeE=scanner.nextInt();
        int sumZ=0;
        int count=0;
        for (int i =0;i<numberP;i++)// 2 7 10
        {
            int orange=scanner.nextInt(); // 5 6
            if (orange<=sizeP)
            {
                sumZ+=orange; // 5
                if (sumZ>sizeE)// 10
                {
                    count++;
                    sumZ=0;
                }
            }
        }
        System.out.println(count);
    }
}
/*
        int y=0;
        int count =0;
        if(sum<=d)
        {
            y=0;
        }else
        {

               while (sum >d)
               {
                   sum -=d;
                   count++;
                   y=1;
               }
        }
        if(y==0)
        {
            System.out.println(0);
        }else
        {
            System.out.println(count);
        }
 */
