
/*
  LeetCode ProblemLInk
  https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseWordsInaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        List<String> list = new ArrayList<>();

        for (String word : words) {
            if (!word.equals("")) {
                list.add(word);
            }
        }

        String reversed = "";

        for (int i = list.size() - 1; i >= 0; i--) {
            reversed += list.get(i);
            if (i > 0) {
                reversed += " ";
            }
        }
        System.out.println(reversed.length());
        System.out.println(reversed);
    }
}
/*
Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.trim().split(" ");
        String reversed = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i];
            if (i > 0) {
                reversed += " ";
            }
        }
        System.out.println(reversed);
 */
