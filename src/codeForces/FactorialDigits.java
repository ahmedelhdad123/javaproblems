package codeForces;

import java.util.Scanner;

public class FactorialDigits {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double num = scanner.nextDouble();
            double result = 0;

            for (int i = 2; i <= num; i++) {
                result += Math.log10(i);
            }

            System.out.println("Number of digits of " + (int)num + "! is " + ((int) result + 1));
        }
}
