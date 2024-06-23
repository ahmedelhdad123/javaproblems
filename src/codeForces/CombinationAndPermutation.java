package codeForces;

import java.util.Scanner;

public class CombinationAndPermutation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
        long k=scanner.nextLong();
        System.out.println(combination(n,k) + " " + permutation(n,k));
    }

    private static long combination(long n, long k) {
        long answer;
        long multMin =1;
        long min = Math.min(n,k);
        for (long i =1;i<=min;i++) {
            multMin*=i;
        }
        answer=permutation(n,k)/multMin;
        return answer;
    }

    private static long permutation(long n, long k) {
        long max = Math.max(n,k);
        long min = Math.min(n,k);
        long multMax=1;
        long multMin=1;
        long answer;
        for (long i=1; i<=max; i++) {
            multMax*=i;
            if (i<=(max-min))
            {
                multMin*=i;
            }
        }
        answer=multMax/multMin;
        return answer;
    }
}
