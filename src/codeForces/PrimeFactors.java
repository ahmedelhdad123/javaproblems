package codeForces;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long num=scanner.nextLong();
        int flag=0;
        for (int i=2; i<=num/2; i++) {
            int counter=0;
            while (num%i==0) {
                counter++;
                num=num/i;
            }
            if (counter>0&&flag==1)
            {
                System.out.print("*");
            }
            if (counter>0)
            {
                System.out.print("("+i+"^"+counter+")");
                flag=1;
            }
            if (num==1)
            {
                return;
            }
        }
        if (num>1 && flag==1)
        {
            System.out.print("*");
        }
        if (num>0)
        {
            System.out.print("("+num+"^"+1+")");
        }
    }
}
