package codeForces;
/*
   Problem Link
   https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/W
 */
import java.util.Scanner;

public class MathematicalExpression {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        char s=scanner.next().charAt(0);
        int b=scanner.nextInt();
        char q=scanner.next().charAt(0);
        int c=scanner.nextInt();

        int op1=a+b,op2=a-b,op3=a*b;
        if (s=='+')
        {
            if (c==op1)
            {
                System.out.println("Yes");
            }else
            {
                System.out.println(op1);
            }
        }else if (s=='-')
        {
            if (c==op2)
            {
                System.out.println("Yes");
            }else
            {
                System.out.println(op2);
            }
        } else {
            if (c==op3)
            {
                System.out.println("Yes");
            }else
            {
                System.out.println(op3);
            }

        }
    }
}
