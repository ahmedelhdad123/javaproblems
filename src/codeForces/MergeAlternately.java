package codeForces;
/*
    Link LeetCode
    https://leetcode.com/problems/merge-strings-alternately/submissions/1235043632/?envType=study-plan-v2&envId=leetcode-75
 */
import java.util.Scanner;

public class MergeAlternately {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        int max=Math.max(word1.length(), word2.length());
        String store="";
        for(int i=0; i<max; i++){
            if (i < word1.length()&&i<word2.length()){
                store=store+word1.charAt(i)+word2.charAt(i);
            }else if (i>=word1.length()){
                store=store+word2.charAt(i);
            }else
            {
                store=store+word1.charAt(i);
            }
        }
        System.out.println(store);
    }
}
