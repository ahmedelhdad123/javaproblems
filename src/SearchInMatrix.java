
/*
    Problem Link
    https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/S
 */
import java.util.Scanner;

public class SearchInMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row=scanner.nextInt();
        int colum=scanner.nextInt();
        int [][] store=new int[row][colum];
        boolean check=false;
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<colum;j++)
            {
                store[i][j]=scanner.nextInt();
            }
        }
        int checkNumber=scanner.nextInt();
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<colum;j++)
            {
                if (store[i][j] == checkNumber)
                {
                    check=true;
                    break;

                }
            }
        }
        String result= check? "will not take number" : "will take number";
        System.out.println(result);
    }
}
