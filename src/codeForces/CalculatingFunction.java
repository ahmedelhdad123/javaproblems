package codeForces;

import java.util.Scanner;

public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long number=scanner.nextLong();
        long last;

        if (number==0)
        {
            System.out.println("0");
        }
        if (number%2==0)
        {
            System.out.println(number/2);
        }else
        {
            last=((number/2)+1)*-1;
            System.out.println(last);
        }
    }
}
