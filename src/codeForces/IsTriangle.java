package codeForces;

import java.util.Arrays;
import java.util.Scanner;

public class IsTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        isTriangle(a,b,c);
    }

    private static void isTriangle(int a, int b, int c) {
        int [] array=new int[3];
        array[0]=a;
        array[1]=b;
        array[2]=c;
        double s= (double) (a + b + c) /2;
        Arrays.sort(array);
        if(array[0]+array[1]>array[2]){
            System.out.println("Valid");
            double answer=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println(answer);
        }else{
            System.out.println("Invalid");
        }
    }
}
