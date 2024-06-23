package codeForces;

import java.util.Scanner;



public class Circles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();

        double centerX1 = (x1 + x2) / 2.0;
        double centerY1 = (y1 + y2) / 2.0;
        double centerX2 = (x3 + x4) / 2.0;
        double centerY2 = (y3 + y4) / 2.0;

        double distance = Math.sqrt(Math.pow(centerX2 - centerX1, 2) + Math.pow(centerY2 - centerY1, 2));

        double radius1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) / 2.0;
        double radius2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2)) / 2.0;

        if (distance <= radius1 + radius2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
