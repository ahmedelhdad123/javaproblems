
/*
   Problem Link In LeetCode
   https://leetcode.com/problems/determine-if-two-strings-are-close/
 */
import java.util.Arrays;
import java.util.Scanner;

public class CloseStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();


        if(word1.length() != word2.length()){
            System.out.println("false");
            return;
        }
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i=0; i<word2.length(); i++){
            freq1[word1.charAt(i) - 'a'] += 1;
            freq2[word2.charAt(i) - 'a'] += 1;
        }

        for(int i=0; i<26; i++){
            if(freq1[i] != 0 && freq2[i] == 0){
                System.out.println("false");
                return;
            }
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        for(int i=0; i<26; i++){
            if(freq1[i] != freq2[i]){
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");
    }
}
