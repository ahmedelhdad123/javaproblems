import java.util.Scanner;

public class TheMaximumPathSum {
    static int row;
    static int colum;
    static int [][] store;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         row=scanner.nextInt();
         colum=scanner.nextInt();
         store=new int[row][colum];
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<colum;j++)
            {
                store[i][j]=scanner.nextInt();
            }
        }
        System.out.println(maxPath(0,0));
    }
    static int maxPath(int start,int end)
    {
        if (start == row - 1 && end == colum - 1) {
            return store[start][end];
        } else if (start == row || end == colum) {
            return Integer.MIN_VALUE;
        }
        int right=maxPath(start,end+1);
        int down=maxPath(start+1,end);
        return store[start][end]+Math.max(right,down);
    }
}
