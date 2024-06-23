package codeForces;
// Problem  Link    https://codeforces.com/contest/281/problem/A

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word=scanner.next();
        if (Character.isUpperCase(word.charAt(0)))
        {
            System.out.println(word);
        }else {
            System.out.println(Character.toUpperCase(word.charAt(0))+word.substring(1));
        }

    }
}
/*
  if (Character.isUpperCase(word.charAt(0)))
        {
            System.out.println(word);
        }else
        {
            StringBuilder stringBuilder = new StringBuilder(word);
            stringBuilder.setCharAt(0, Character.toUpperCase(word.charAt(0)));
            String finalWord = stringBuilder.toString();
            System.out.println(finalWord);
        }
 */
