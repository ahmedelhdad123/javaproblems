package codeForces;

import java.util.Scanner;

public class GeometryTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int r=scanner.nextInt();
        int s=scanner.nextInt();
        if (s>= r*2){
            System.out.println("Square");
        } else if (r*2>Math.sqrt(Math.pow(s,2)+Math.pow(s,2))) {

            System.out.println("Circle");
        }else
        {
            System.out.println("Complex");
        }

    }
}
