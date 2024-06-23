package codeForces;

import java.util.Scanner;

//problem link  https://codeforces.com/contest/807/problem/A
public class IsItRated {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int check=0;
        int check2=0;
        int temp=0;
        for (int i=0;i<size;i++)
        {
            int num1=scanner.nextInt();
            int num2=scanner.nextInt();
            if (num1!=num2)
            {
                check=1;
                break;
            }if (temp < num1 && i !=0) {
                 check2=1;
            }
            temp=num1;
        }

        if (check==1)
        {
            System.out.println("rated");
        }else if (check2==1)
        {
            System.out.println("unrated");
        }else
        {
            System.out.println("maybe");
        }
    }
}
