package codeForces;
/*
  Problem Link
   https://codeforces.com/contest/514/problem/A
 */

import java.util.Scanner;

public class ChewbacaAndNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String inputString = scanner.nextLine();
        char [] store=inputString.toCharArray();
        for (int i = 0; i < inputString.length(); i++) {
            if (store[i]>='5')
            {
                store[i]= (char) ('9'-inputString.charAt(i)+'0');
            }
        }
        if (store[0]=='0')
        {
            store[0]='9';
        }

        String result=new String(store);
        System.out.println(result);


    }
}
