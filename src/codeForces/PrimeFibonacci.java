package codeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        while (size-->0)
        {
            long number=scanner.nextLong();
            long fibona=Fibonacci(number);
            System.out.println(isPrime(fibona));

        }

    }
    public static long Fibonacci(long number)
    {
        ArrayList<Long> store=new ArrayList<>();
        store.add(0L);
        store.add(1L);
        if (number==1)
        {
           return 0;
        }else if (number==2)
        {
            return 1;
        }else {
            for (int i=0;i<=number;i++)
            {
                store.add(store.get(i)+store.get(i+1));
                if (store.size()==number)
                {
                    break;
                }
            }
            return store.get((int) (number-1));
        }
    }
    public static String isPrime(long number)
    {
        if (number<2)
        {
            return "not prime";
        }else
        {
            for (int i=2;i<=Math.sqrt(number);i++)
            {
                if (number%i==0)
                {
                    return "not prime";
                }
            }
        }
        return "prime";
    }
}
/*
          boolean[] prime = { false, false, false, false, true, true, true, false, true, false,
                false, false, true, false, true, false, false, false, true,
                false, false, false, false, false, true, false, false, false,
                false, false, true, false, false, false, false, false, false,
                false, false, false, false, false, false, false, true, false,
                false, false, true, false, false };

        int t = scanner.nextInt();
        while (t-- > 0) {
            int num = scanner.nextInt();
            if (prime[num])
                System.out.println("prime");
            else
                System.out.println("not prime");
        }
        scanner.close();
    }
 */
