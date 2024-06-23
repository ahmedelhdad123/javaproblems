package codeForces;

import java.util.Scanner;

public class SummationOfItsDivisors {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long input=scanner.nextLong();
        summationOfItsDivisors(input);
    }

    private static void summationOfItsDivisors(long input) {
        long sum=0;
        for (int i=1;i<=Math.sqrt(input);i++) // 1 3
        {
            if (input%i==0)
            {
                sum+=i;
                if(i != Math.sqrt(input))
                {
                    sum+=input/i;
                }
            }
        }
        System.out.println(sum);
    }
}
