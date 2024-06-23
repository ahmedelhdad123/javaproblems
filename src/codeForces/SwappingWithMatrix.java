package codeForces;

import java.util.Scanner;

public class SwappingWithMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int [][] matrix=new int[size][size];
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        for (int a=0;a<size;a++)
        {
            for (int b=0;b<size;b++)
            {
                matrix[a][b]=scanner.nextInt();
            }
        }
        swapRows(matrix, x, y);
        swapColumns(matrix, x, y);

        printMatrix(matrix);
    }

    private static void swapRows(int[][] matrix, int x, int y) {
        int [] temp=matrix[x-1];
        matrix[x-1]=matrix[y-1];
        matrix[y-1]=temp;
    }

    private static void swapColumns(int[][] matrix, int x, int y) {
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][x - 1];
            matrix[i][x - 1] = matrix[i][y - 1];
            matrix[i][y - 1] = temp;
        }
    }
    private static void printMatrix(int[][] matrix) {
        for (int a=0;a<matrix.length;a++)
        {
            for (int b=0;b< matrix[a].length;b++)
            {
                System.out.print(matrix[a][b]+ " ");
            }
            System.out.println();
        }
    }

}
