package codeForces;
// Problem Link  https://codeforces.com/contest/734/problem/A

import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int countA=0;
        int countD=0;
        int number=scanner.nextInt();
        String character=scanner.next();
        char[]store=character.toCharArray();
        for (int i=0;i<store.length;i++)
        {
            if (store[i]=='A')
            {
                countA++;
            }else
            {
                countD++;
            }
        }
        if (countA==countD)
        {
            System.out.println("Friendship");
        } else if (countA>countD) {
            System.out.println("Anton");
        }else
        {
            System.out.println("Danik");
        }
    }
}
