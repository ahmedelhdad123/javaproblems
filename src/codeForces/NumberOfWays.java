package codeForces;

import java.util.Scanner;

public class NumberOfWays {
        static int num1, num2;
        static int way(int number) {
            if (number >= num2) {
                return number == num2 ? 1 : 0;
            }
            return way(number + 1) + way(number + 2) + way(number + 3);
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            System.out.println(way(num1));
        }
}

