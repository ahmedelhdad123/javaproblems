
/*
   Problem Link
   https://codeforces.com/problemset/problem/479/A
 */

import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt(),b=scanner.nextInt(),c=scanner.nextInt();
        int op1=0,op2=0,op3=0,op4=0,op5=0;
        op1=a+(b*c);
        op2=a*(b+c);
        op3=a*b*c;
        op4=(a+b)*c;
        op5=a+b+c;
        int resul=Math.max(Math.max(Math.max(op1,op2),Math.max(op3,op4)),op5);
        System.out.println(resul);
    }
}
