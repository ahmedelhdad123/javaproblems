import java.util.Scanner;

public class SumOfAMatrix {
    static int[][] result;
    static int rows;
    static int columns;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        result = new int[r][c];
        int[][] matrixA = new int[r][c];
        int[][] matrixB = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }
        rows = r;
        columns = c;
        sumOfAMatrix(matrixA, matrixB, 0, 0);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void sumOfAMatrix(int[][] matrixA, int[][] matrixB, int i, int j) {
        if (i >= rows) {
            return;
        }
        if (j >= columns) {
            sumOfAMatrix(matrixA, matrixB, i + 1, 0);
            return;
        }
        result[i][j] = matrixA[i][j] + matrixB[i][j];
        sumOfAMatrix(matrixA, matrixB, i, j + 1);
    }
}
