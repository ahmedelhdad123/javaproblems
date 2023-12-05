
/*
    Problem Link
    https://codeforces.com/contest/483/problem/A
 */
import java.util.Scanner;

public class Counterexample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long first=scanner.nextLong();
        long second=scanner.nextLong();
        long result=second-first;
        boolean f1 = isEven(first);
        boolean f2 = isEven(second);
        if (result<=1)
        {
            System.out.println("-1");
        }else
        {
            if (f1 && f2)
            {
                if (result<=2)
                {
                    System.out.println(first + " " + (first+1) + " " + second);
                }else
                {
                    System.out.println((first)  + " " + (first+1) + " " + (first+2));
                }

            }else if (f1)
            {
                System.out.println(first + " " + (first+1) + " " + (first+2));
            }else if (f2)
            {
                System.out.println((first+1)  + " " + (first+2) + " " + (first+3));
            }else
            {
                if (result<=2)
                {
                    System.out.println("-1");
                }else
                {
                    System.out.println((first+1)  + " " + (first+2) + " " + (first+3));
                }
            }
        }

    }
    public static boolean isEven(long number) {
        if (number % 2 != 0) {
            return false;
        }
        return true;
    }
}
