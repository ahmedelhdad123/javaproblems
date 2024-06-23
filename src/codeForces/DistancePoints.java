package codeForces;

import java.util.Scanner;

import static java.awt.geom.Point2D.distance;


public class DistancePoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println(distance(x1, y1, x2, y2));

    }

//    private static double distance(int x1, int y1, int x2, int y2) {
//        double distance =0;
//        distance = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
//        return distance;
//    }
}
