package codeForces;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a="ahmed";
        StringBuilder b=new StringBuilder(a);
        b.append(b.charAt(3));
        a=b.toString();
        System.out.println(a);
        System.out.println(b);
    }
}
