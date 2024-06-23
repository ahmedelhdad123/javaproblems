package codeForces;

import java.util.Scanner;

public class BowWowAndTheTimetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String str = scanner.next();
            int last1 = -1, cnt1s = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                    if (last1 == -1)
                        last1 = i;
                    cnt1s += 1;
                }
            }

            if (cnt1s == 0) {
                System.out.println(0);
                continue;
            }

            last1 = str.length() - last1 - 1;

            if (last1 % 2 == 1) {
                last1 += 1;
                cnt1s = 0;  // upgrade
            }

            last1 = last1 / 2;

            if (cnt1s > 1) {
                last1 += 1;
            }

            System.out.println(last1);
            break;
        }
    }
}