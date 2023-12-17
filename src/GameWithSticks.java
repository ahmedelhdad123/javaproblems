
/*
   Problem Link
   https://codeforces.com/problemset/problem/451/A
 */
import java.util.Scanner;

public class GameWithSticks {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row=scanner.nextInt();
        int colum=scanner.nextInt();

        if (row>colum)
        {
            if (colum%2==0)
            {
                System.out.println("Malvika");
            }else
            {
                System.out.println("Akshat");
            }
        }else
        {
            if (row%2==0)
            {
                System.out.println("Malvika");
            }else
            {
                System.out.println("Akshat");
            }
        }



    }
}
