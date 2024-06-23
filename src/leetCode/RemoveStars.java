package leetCode;/*

  Leetcode Problem Link
  https://leetcode.com/problems/removing-stars-from-a-string/?envType=study-plan-v2&envId=leetcode-75
 */
import java.util.Scanner;
import java.util.Stack;

public class RemoveStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char currentChar =s.charAt(i);
            if(currentChar=='*'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else
            {
                stack.push(currentChar);
            }
        }
        s= "";
        for (Character c : stack) {
            s += c;
        }
        System.out.println(s);

    }
}
/*
  Time Limit Exceeded

List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        int i=0;
        while (i<list.size())
        {
            if (list.get(i) == '*') {
                list.remove(i);
                if (i>0)
                {
                    list.remove(i-1);
                    i--;
                }
            }else
            {
                i++;
            }
        }
        StringBuilder result = new StringBuilder();
        for (Character c : list) {
            result.append(c);
        }
        s=new String(result);

        System.out.println(s);
 */
