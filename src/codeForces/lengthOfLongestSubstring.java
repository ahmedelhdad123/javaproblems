package codeForces;
/*
    LeetCode Link
    https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
            Set<Character> set=new HashSet<Character>();
            int max=0;
            int left=0;
            for (int right=0;right<s.length();right++) {
                if (!set.contains(s.charAt(right))) {
                    set.add(s.charAt(right));
                    max=Math.max(max,right-left+1);
                }else
                {
                    while (s.charAt(left)!=s.charAt(right))
                    {
                        set.remove(s.charAt(left));
                        left++;
                    }
                    set.remove(s.charAt(left));left++;
                    set.add(s.charAt(right));
                }
            }
        System.out.println(max);
    }
}
