package codeForces;

import java.util.HashMap;
import java.util.Scanner;

public class Announcement  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number<=0)
        {
            System.out.println(-1);
            return;
        }
        int[] levels = new int[number];

        HashMap<Integer, Integer> difficultyCount = new HashMap<>();

        for (int i = 0; i < number; i++) {
            levels[i] = scanner.nextInt();
            difficultyCount.put(levels[i], difficultyCount.getOrDefault(levels[i], 0) + 1);
        }

        int duplicates = 0;
        for (int count : difficultyCount.values()) {
            if (count > 1) {
                duplicates += count - 1;
            }
        }

        if (duplicates == 0) {
            System.out.println("-1");
        } else {
            System.out.println(duplicates);
        }
    }
}
