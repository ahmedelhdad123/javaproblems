package codeForces;

import java.util.Scanner;

public class PalindromesReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int n = S.length();
        char[] palindrome = new char[n];

        for (int i = 0; i < n / 2; i++) {
            char ch1 = S.charAt(i);
            char ch2 = S.charAt(n - 1 - i);
            if (ch1 == '?' && ch2 == '?') {
                palindrome[i] = 'a';
                palindrome[n - 1 - i] = 'a';
            } else if (ch1 == '?') {
                palindrome[i] = ch2;
                palindrome[n - 1 - i] = ch2;
            } else if (ch2 == '?') {
                palindrome[i] = ch1;
                palindrome[n - 1 - i] = ch1;
            } else {
                if (ch1 != ch2) {
                    System.out.println("-1");
                    return;
                }
                palindrome[i] = ch1;
                palindrome[n - 1 - i] = ch1;
            }
        }

        if (n % 2 != 0) {
            int mid = n / 2;
            if (S.charAt(mid) == '?') {
                palindrome[mid] = 'a';
            } else {
                palindrome[mid] = S.charAt(mid);
            }
        }

        System.out.println(new String(palindrome));
    }
}