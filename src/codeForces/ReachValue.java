package codeForces;

import java.util.Scanner;

public class ReachValue {
    static long input;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        while (number-->0)
        {
            input=scanner.nextLong();
            if (reachValue(1))
            {
                System.out.println("YES");
            }else
            {
                System.out.println("NO");
            }
        }

    }

    private static boolean reachValue(long number) {
        if (number>input)
        {
            return false;
        }
        if (number==input)
        {
            return true;
        }else
        {
            return reachValue(number*10)||reachValue(number*20);
        }
    }
}
