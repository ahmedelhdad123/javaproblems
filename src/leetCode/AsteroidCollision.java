package leetCode;
/*
   Leetcode ProblemLink
   https://leetcode.com/problems/asteroid-collision/?envType=study-plan-v2&envId=leetcode-75
 */
import java.util.Scanner;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] asteroids = new int[size];
        for (int i = 0; i < size; i++) {
            asteroids[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();


        for (int asteroid : asteroids) { // 5 10 -5
            boolean exploded = false;
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (stack.peek() < -asteroid) {
                    stack.pop();
                } else if (stack.peek() == -asteroid) {
                    stack.pop();
                    exploded = true;
                    break;
                } else {
                    exploded = true;
                    break;
                }
            }
            if (!exploded) {
                stack.push(asteroid);
            }
        }
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        for (int i:result)
        {
            System.out.println(i);
        }

    }
}
