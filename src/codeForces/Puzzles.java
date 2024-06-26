
/*
   https://codeforces.com/group/MWSDmqGsZm/contest/223207/problem/F
 */
package codeForces;

import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStudents = in.nextInt();
        int numberOfPuzzles = in.nextInt();
        int[] puzzles = new int[numberOfPuzzles];

        for (int i = 0; i < numberOfPuzzles; i++) {
            puzzles[i] = in.nextInt();
        }

        Arrays.sort(puzzles);

        long currentMin = Integer.MAX_VALUE;
        for (int i = 0; i <= numberOfPuzzles - numberOfStudents; i++) {
            long min = puzzles[i];
            long max = puzzles[i + numberOfStudents - 1];
            long result = max - min;
            if (currentMin > result) {
                currentMin = result;
            }
        }

        System.out.println(currentMin);
    }
}
