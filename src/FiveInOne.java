import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FiveInOne {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int []store=new int[size];
        for (int i=0;i<size;i++)
        {
            store[i]=scanner.nextInt();
        }
        System.out.println("The maximum number : " + maximum(store));
        System.out.println("The minimum number : "+ minimum(store));
        System.out.println("The number of prime numbers : "+ prime(store));
        System.out.println("The number of palindrome numbers : "+ palindrome(store));
        System.out.println("The number that has the maximum number of divisors : "+ findNumberWithMaxDivisors(store));
    }

    private static int findNumberWithMaxDivisors(int[] arr) {
        int maxDivisors = 0;
        int largestNumberWithMaxDivisors = 0;

        for (int num : arr) {
            int divisors = countDivisors(num);
            if (divisors > maxDivisors || (divisors == maxDivisors && num > largestNumberWithMaxDivisors)) {
                maxDivisors = divisors;
                largestNumberWithMaxDivisors = num;
            }
        }

        return largestNumberWithMaxDivisors;
    }
    private static int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }

    private static int palindrome(int[] store) {
        int count=0;
        for (int i=0;i<store.length;i++)
        {
            boolean check=true;
            if (store[i]<=9)
            {
                count++;
            }else
            {
                String test=String.valueOf(store[i]);
                int x=test.length()-1;
                for (int j=0;j<test.length()/2;j++)
                {
                    if (test.charAt(j)!=test.charAt(x))
                    {
                        check=false;
                        break;
                    }
                }
                if (check)
                {
                    count++;
                }
            }
        }
        return count;
    }

    private static int prime(int[] store) {
        int count=0;
        for (int i=0;i<store.length;i++)
        {
            boolean check=true;
            if (store[i]<=1)
            {
                check=false;
            }else
            {
                for (int j=2;j<=Math.sqrt(store[i]);j++)
                {
                    if (store[i] % j == 0)
                    {
                        check=false;
                        break;
                    }
                }
            }
            if (check)
            {
                count++;
            }
        }
        return count;

    }

    private static int minimum(int[] store) {
        int min=Integer.MAX_VALUE;
        for (int i=0;i<store.length;i++)
        {
            if (min>store[i])
            {
                min=store[i];
            }
        }
        return min;
    }

    private static int maximum(int[] store) {
        int max=Integer.MIN_VALUE;
        for (int i=0;i<store.length;i++)
        {
            if (max<store[i])
            {
                max=store[i];
            }
        }
        return max;
    }
}
