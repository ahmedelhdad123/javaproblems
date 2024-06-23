package codeForces;

import java.util.Scanner;

public class nSequence {
    static long count=1;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long number=scanner.nextLong();
        NSequence(number);
        System.out.println(count);
    }

    private static long NSequence(long number) {
        if (number == 1 )
        {
            return count;
        }
        if (number%2==0)
        {
            number=number/2;
            count++;
        }else
        {
            number=3*number+1;
            count++;
        }
        return NSequence(number);
    }
}
