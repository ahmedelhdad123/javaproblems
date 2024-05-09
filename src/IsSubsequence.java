
/*
   LeetCode Problem Link
   https://leetcode.com/problems/is-subsequence/submissions/1253699898/?envType=study-plan-v2&envId=leetcode-75
 */
import java.util.Scanner;

public class IsSubsequence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String t=scanner.nextLine();
        char [] storeS=s.toCharArray();
        char [] storeT=t.toCharArray();
        int countS=0;
        int countT=0;
        while (countS<storeS.length && countT<storeT.length){
            if (storeS[countS]==storeT[countT]){
                countS++;
                countT++;
            }else
            {
                countT++;
            }
        }
        if (countS==storeS.length){
            System.out.println("YES");
        }else
        {
            System.out.println("NO");
        }

    }
}
