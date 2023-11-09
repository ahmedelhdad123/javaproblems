
// Problem Link   https://codeforces.com/contest/9/problem/A

import java.util.Scanner;

public class DieRoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int w = scanner.nextInt();


        int a = Math.max(y, w);
        int x = 7 - a;
        if (6 % x == 0) {
            System.out.println("1/" + (6 / x));
        } else if (6 % x != 0) {
            if (x % 2 == 0) {
                int g = x / 2;
                int h = 6 / 2;
                System.out.println(g + "/" + h);
            } else {
                System.out.println(x + "/6");
            }

        } else if (x == 0) {
            System.out.println("0/1");
        } else {
            System.out.println("1/1");
        }
    }
}
