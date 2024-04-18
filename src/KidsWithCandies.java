
/*
    LeetCode
    https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/1235962673/?envType=study-plan-v2&envId=leetcode-75
 */
import java.util.Scanner;

public class KidsWithCandies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int[] candies = new int[n];
        boolean[] result = new boolean[n];
        for (int i = 0; i < candies.length; i++) {
            candies[i] = scanner.nextInt();
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        int extraCandies = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            candies[i] += extraCandies;
            result[i] = candies[i] >= max;
        }


        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}
