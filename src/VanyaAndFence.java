
// Problem Link   https://codeforces.com/contest/677/problem/A

import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int height=scanner.nextInt();
        int count =0;
        for (int i=0;i<n;i++)
        {
            int person=scanner.nextInt();
            if (person>height)
            {
                count=count+2;
            }else
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
