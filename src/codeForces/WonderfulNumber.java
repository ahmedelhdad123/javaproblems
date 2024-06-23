package codeForces;

import java.util.Scanner;

public class WonderfulNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        long input = scanner.nextLong();

        if (isWonderful(input)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }

    private static boolean isWonderful(long n) {
        if (n % 2 != 0) {

            String binaryRepresentation = Long.toBinaryString(n);

            return isPalindrome(binaryRepresentation);
        }

        return false;
    }

    // Function to check if a string is palindrome
    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
