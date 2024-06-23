package codeForces;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long number= scanner.nextLong();
        long number2=scanner.nextLong();

        System.out.println(operation(number,number2));
    }

    private static long operation(long number, long number2) { // 5 5
        long answer=0;
        for (int i=2;i<=number2;i+=2) // 5
        {
            answer += power(number,i); // 5 2
        }
        return answer;
    }

    private static long power(long number, int i) { // 5 2
        long result=1;
        for (int x=0;x<i;x++)
        {
            result *=number ;
        }
        return result;
    }
}
/*

   System.out.println(operation(number,number2));
    }

    private static long operation(long number, long number2) {
        long answer=0;
        for (int i=2;i<=number2;i+=2)
        {
            answer= (long) (answer+(Math.pow(number,i)));
        }
        return answer;

 */
