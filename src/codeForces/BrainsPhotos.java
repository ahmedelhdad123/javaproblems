package codeForces;

import java.util.Scanner;

//problem Link https://codeforces.com/contest/707/problem/A
public class BrainsPhotos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row=scanner.nextInt();
        int colum=scanner.nextInt();
        boolean check =false;
        char [][] matrix=new char[row][colum];
        for (int i=0;i< row;i++)
        {
            for (int j=0;j<colum;j++)
            {
                matrix[i][j]=scanner.next().charAt(0);
            }
        }
        for (int i=0;i< matrix.length;i++)
        {
            for (int j=0;j<matrix[i].length;j++)
            {
                if (matrix[i][j]=='Y'||matrix[i][j]=='M'||matrix[i][j]=='C')
                {
                    check=true;

                }
            }
        }
        if (check==true)
        {
            System.out.println("#Color");
        }else
        {
            System.out.println("#Black&White");
        }

    }
}
