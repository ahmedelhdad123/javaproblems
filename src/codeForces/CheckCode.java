package codeForces;

import java.util.Scanner;

public class CheckCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int countR = 0, countL = 0;
        String line = scanner.next();

        if (a+b+1!=line.length())
        {
            System.out.println("No");
            return;
        }
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) != '-') {
                countR++;
            } else {
                break;
            }
        }

        for (int i = line.length() - 1; i >= 0; i--) {
            if (line.charAt(i) != '-') {
                countL++;
            } else {
                break;
            }
        }

        if (countR == a && countL == b && line.charAt(a) == '-') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
