package leetCode;
/*
   LeetCode
   https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75
 */
import java.util.Scanner;

public class ReverseVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase();
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        int l = 0, r = word.length() - 1;
        char[] wordArray = word.toCharArray();

        while (l < r) {
            while (l < r && !isVowel(wordArray[l], vowels)) {
                l++;
            }
            while (l < r && !isVowel(wordArray[r], vowels)) {
                r--;
            }
            if (l < r) {
                char temp = wordArray[l];
                wordArray[l] = wordArray[r];
                wordArray[r] = temp;
                l++;
                r--;
            }
        }

        String reversedWord = new String(wordArray);
        System.out.println(reversedWord);
    }
    private static boolean isVowel(char c, char[] vowels) {
        for (char vowel : vowels) {
            if (c == vowel) {
                return true;
            }
        }
        return false;
    }
}
