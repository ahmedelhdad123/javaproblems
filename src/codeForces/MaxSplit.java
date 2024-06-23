package codeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        ArrayList<String> balancedStrings = splitBalancedString(input);

        System.out.println(balancedStrings.size());
        for (String s : balancedStrings) {
            System.out.println(s);
        }
    }

    private static ArrayList<String> splitBalancedString(String input) {
        ArrayList<String> result = new ArrayList<>();

        int count = 0;
        StringBuilder currentString = new StringBuilder();

        for (char c : input.toCharArray()) {
            currentString.append(c);
            if (c == 'R') {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                result.add(currentString.toString());
                currentString = new StringBuilder();
            }
        }
        return result;
    }
}