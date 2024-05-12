
/*
   LeetCode Problem Link
   https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/?envType=study-plan-v2&envId=leetcode-75
 */
import java.util.Scanner;

public class MaxVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k=sc.nextInt();
        int maxVowels = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i)))
                count++;
        }
        maxVowels = count;

        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i)))
                count++;
            if (isVowel(s.charAt(i - k)))
                count--;
            maxVowels = Math.max(maxVowels, count);
        }
        System.out.println(maxVowels);

    }
    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
/*
        int maxVowels = Integer.MIN_VALUE;
        for (int i = 0; i <= s.length()-k; i++) {
            int count=0;
            for (int j = i; j < i+k; j++) {
                if (s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u'){
                    count++;
                }
            }
            maxVowels = Math.max(maxVowels,count);
        }
        System.out.println(maxVowels);
 */
