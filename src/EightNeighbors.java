
/*
    Problem Link
    https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/X
 */
import java.util.Scanner;

public class EightNeighbors {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row= scanner.nextInt();
        int column= scanner.nextInt();
        scanner.nextLine();
        char[][] arr = new char[101][101];
        for (int i = 1; i <= row; i++) {
            String line=scanner.nextLine();
            for (int z = 1; z <= column; z++) {
                arr[i][z] = line.charAt(z-1);
            }
        }

        int rowIn, columnIn;
        rowIn = scanner.nextInt();
        columnIn = scanner.nextInt();

        if (arr[rowIn][columnIn - 1] != '.' &&
                arr[rowIn][columnIn + 1] != '.' &&
                arr[rowIn - 1][columnIn] != '.' &&
                arr[rowIn + 1][columnIn] != '.' &&
                arr[rowIn - 1][columnIn - 1] != '.' &&
                arr[rowIn - 1][columnIn + 1] != '.' &&
                arr[rowIn + 1][columnIn - 1] != '.' &&
                arr[rowIn + 1][columnIn + 1] != '.') {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
