package codeForces;
/*
  Problem Link
  https://codeforces.com/contest/69/problem/A
 */
import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[][] store = new int[number][3];
        int sum = 0;

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 3; j++) {
                store[i][j] = scanner.nextInt();
            }
        }

        boolean check = true;
        for (int j = 0; j < 3; j++) {
            sum = 0;
            for (int i = 0; i < number; i++) {
                sum += store[i][j];
            }
            if (sum != 0) {
                check = false;
                break;
            }
        }

        String result = check ? "YES" : "NO";
        System.out.println(result);
    }
}
