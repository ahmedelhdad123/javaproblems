package codeForces;
/*
  Problem Link
  https://codeforces.com/contest/699/problem/A
 */

import java.util.Scanner;

public class LaunchOfCollider {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String line = scanner.next();
        char[] character = line.toCharArray();
        int[] store = new int[number];
        int count =  0,temp=Integer.MAX_VALUE;
        for (int i = 0; i < number; i++) {
            store[i] = scanner.nextInt();
        }
        for (int i = 0; i < store.length - 1; i++) {
                if (character[i]=='R' && character[i+1] =='L') {
                    count=(store[i+1]-store[i])/2;
                    if (count<temp)
                    {
                        temp=count;
                        System.out.println(temp);
                    }
                }
        }
        int result = count != 0 ? temp : -1;
        System.out.println(result);
    }
}
