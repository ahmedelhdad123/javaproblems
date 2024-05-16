
/*
  CodeForces ProblemLink
  https://codeforces.com/group/MWSDmqGsZm/contest/223206/problem/R
 */
import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] soldiers = new int[n];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int indexMax = 0, indexMin = 0;
        for (int i = 0; i < n; i++) {
            soldiers[i] = in.nextInt();
            if (soldiers[i] <= min) {
                min = soldiers[i];
                indexMin = i;
            }
            if (soldiers[i] > max) {
                max = soldiers[i];
                indexMax = i;
            }
        }
        int sum = indexMax + (n - 1 - indexMin);
        if (indexMax > indexMin) {
            sum--;
        }
        System.out.println(sum);
    }
}
