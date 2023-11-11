
 // Problem Link
 /*
  https://codeforces.com/contest/799/problem/A
  */

import java.util.Scanner;

public class CarrotCakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int k = scanner.nextInt();
        int d = scanner.nextInt();
        int time = (t + d) / t;
        int store = time * k;
        String check = store < n ? "YES" : "NO";
        System.out.println(check);
    }
}
