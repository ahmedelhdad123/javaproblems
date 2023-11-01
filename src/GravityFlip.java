
// Problem Link   https://codeforces.com/contest/405/problem/A

import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        int [] store=new int[number];
        for (int i=0;i<number;i++)
        {
            store[i]=scanner.nextInt();
        }
        Arrays.sort(store);
        for (int i=0;i<number;i++)
        {
            System.out.println(store[i]);
        }

    }
}
