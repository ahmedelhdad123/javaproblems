
/*
  Problem Link
  https://codeforces.com/contest/143/problem/A
 */
import java.util.ArrayList;
import java.util.Scanner;

public class HelpVasilisaTheWise2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row1=scanner.nextInt();
        int row2=scanner.nextInt();
        int colum1=scanner.nextInt();
        int colum2=scanner.nextInt();
        int d1=scanner.nextInt();
        int d2=scanner.nextInt();
       for (int a=1;a<=9;a++)
        {
            for (int b=1;b<=9;b++)
            {
                for (int c=1;c<=9;c++)
                {
                    for (int d=1;d<=9;d++)
                    {
                        if (a!=b && a!=c && a!=d && b!=c && b!=d && c!=d)
                        {
                            if (a+b==row1 && a+d==d1 && a+c==colum1 && c+d==row2 && c+b==d2 && b+d==colum2) {
                                System.out.println(a + " " + b);
                                System.out.println(c + " " + d);
                                return;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("-1");
    }
}
