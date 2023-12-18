
/*
   Problem Link
   https://codeforces.com/group/MWSDmqGsZm/contest/223207/problem/A
 */
import java.util.Scanner;

public class DrawingTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row=scanner.nextInt();
        int column=scanner.nextInt();
        int process=scanner.nextInt();
        char [][] store=new char[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                store[i][j] = '.';
            }
        }
        while (process-->0)
        {
            int r1=scanner.nextInt();
            int c1=scanner.nextInt();
            int r2=scanner.nextInt();
            int c2=scanner.nextInt();
            char character=scanner.next().charAt(0);
            int minR=Math.min(r1,r2);
            int maxR=Math.max(r1,r2);
            int minC=Math.min(c1,c2);
            int maxC=Math.max(c1,c2);
            for (int i=minR-1;i<=maxR-1;i++)
            {
                for (int j=minC-1;j<=maxC-1;j++)
                {
                    store[i][j]=character;
                }
            }
        }
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                System.out.print(store[i][j]);
            }
            System.out.println();
        }


    }
}
