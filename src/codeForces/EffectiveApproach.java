package codeForces;
/*
   Problem Link
   https://codeforces.com/contest/227/problem/B

 */
import java.util.Scanner;

public class EffectiveApproach {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N = scanner.nextInt();
        int[] ix = new int[100005];
        int num;

        for (int i = 1; i <= N; i++) {
            num = scanner.nextInt();
            ix[num] = i;
        }

        int M, q;
        long tot1 = 0, tot2 = 0;

        M = scanner.nextInt();

        while (M-- > 0) {
            q = scanner.nextInt();
            tot1 += ix[q];
            tot2 += N - ix[q] + 1;
        }

        System.out.println(tot1 + " " + tot2);
    }
}
