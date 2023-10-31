
//Problem Link   https://codeforces.com/contest/791/problem/A

import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int l=scanner.nextInt();
        int b=scanner.nextInt();
        int count=0;
        Boolean check=true;
        while (check)
        {
            if (l<=b)
            {
                l*=3;
                b*=2;
                count++;
            }else
            {
                check=false;
            }
        }
        System.out.println(count);
    }
}
