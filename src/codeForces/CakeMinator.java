package codeForces;
/*
  CodeForces Problem Link
  https://codeforces.com/group/MWSDmqGsZm/contest/223206/problem/N
 */
import java.util.Scanner;

public class CakeMinator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();
        int cntr = 0;
        char[][] arr = new char[r][c];

        for (int i = 0; i < r; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < c; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < r; i++) {
            boolean flag = true;
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 'S') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                cntr += c;
                for (int k = 0; k < c; k++) {
                    arr[i][k] = 'X';
                }
            }
        }

        for (int i = 0; i < c; i++) {
            boolean flag = true;
            for (int j = 0; j < r; j++) {
                if (arr[j][i] == 'S') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                for (int k = 0; k < r; k++) {
                    if (arr[k][i] != 'X') {
                        cntr++;
                    }
                }
            }
        }
        System.out.println(cntr);
    }
}
