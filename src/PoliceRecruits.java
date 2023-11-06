
// Problem Link  https://codeforces.com/contest/427/problem/A

import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        int countN=0 , countP=0;
        for (int i=0;i<number;i++)
        {
           int police=scanner.nextInt();
           if (police==-1)
           {
               if (countP>0)
               {
                   countP--;
               }else
               {
                   countN++;
               }
           }else
           {
               countP+=police;
           }
        }

        System.out.println(countN);
    }
}
