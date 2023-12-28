
/*
    Problem Link
    https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/W
 */
import java.util.Scanner;

public class MirrorArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] store = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                store[i][j] = scanner.nextInt();
            }
        }

        int[][] invertedStore = new int[row][column];
        for (int i = 0; i < row; i++) {
            int a = 0;
            for (int j = column - 1; j >= 0; j--) {
                invertedStore[i][a] = store[i][j];
                a++;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(invertedStore[i][j] + " ");
            }
            System.out.println();
        }
    }
}
