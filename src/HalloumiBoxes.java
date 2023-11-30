
/*
   Problem Link
   https://codeforces.com/contest/1903/problem/A

 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HalloumiBoxes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }

            if (isSorted(a)) {
                System.out.println("YES");
            }else {
                if (k>1)
                {
                    System.out.println("YES");
                }else
                {
                    System.out.println("NO");

                }
            }
        }
    }
    private static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
