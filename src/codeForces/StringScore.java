package codeForces;

import java.util.Arrays;
import java.util.Scanner;

public class StringScore {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        String store=scanner.next();
        System.out.println(calculateScore(store));
    }
    public static int calculateScore(String string) {
        int score = 0;
        StringBuilder test=new StringBuilder(string);
        for (int i = 0; i < test.length(); i++) {
            char currentChar = test.charAt(i);
            if (currentChar == 'V') {
                score += 5;
            } else if (currentChar == 'W') {
                score += 2;
            } else if (currentChar == 'X') {
                if (i < test.length() - 1) {
                    i++;
                }
            } else if (currentChar == 'Y') {
               test.append(test.charAt(i+1));
               i++;
            } else if (currentChar == 'Z') {
                if (i < test.length() - 1) {
                    if (test.charAt(i+1) == 'V') {
                        score /= 5;
                    } else if (test.charAt(i+1) == 'W') {
                        score /= 2;
                    }
                    i++;
                }
            }
        }

        return score;
    }
}
