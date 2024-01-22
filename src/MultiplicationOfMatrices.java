import java.util.Scanner;

public class MultiplicationOfMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int rowA = scanner.nextInt();
        int columnA = scanner.nextInt();
        int[][] matrixA = new int[rowA][columnA];

        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnA; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        int rowB = scanner.nextInt();
        int columnB = scanner.nextInt();
        int[][] matrixB = new int[rowB][columnB];

        for (int i = 0; i < rowB; i++) {
            for (int j = 0; j < columnB; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }



        int[][] resultMatrix = new int[rowA][columnB];
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnB; j++) {
                for (int k = 0; k < columnA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnB; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
