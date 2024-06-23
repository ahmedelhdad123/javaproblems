package leetCode;
/*
   Problem Link In LeetCode
   https://leetcode.com/problems/decode-string/submissions/1293871151/
 */
import java.util.Scanner;
import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resultStack = new Stack<>();
        String currentString = "";
        int k = 0;

        for (char c : s.toCharArray()) { // 3[a]2[bc]
            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0'); // 3
            } else if (c == '[') {
                countStack.push(k); // 3
                resultStack.push(currentString);
                currentString = "";
                k = 0;
            } else if (c == ']') {
                StringBuilder decodedString = new StringBuilder(resultStack.pop());
                int currentK = countStack.pop();
                decodedString.append(currentString.repeat(Math.max(0, currentK)));
                currentString = decodedString.toString();
            } else {
                currentString += c;
            }
        }

        System.out.println(currentString);
    }
}
