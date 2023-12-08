
/*
  Problem Link
  https://codeforces.com/contest/6/problem/B
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PresidentOffice {

    static int n, m;
    static char col;

    static boolean valid(int x, int y) {
        return x > -1 && x < n && y > -1 && y < m;
    }

    static int[] dirx = {-1, 0, 1, 0};
    static int[] diry = {0, 1, 0, -1};
    static char[][] room;
    static Set<Character> ans;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        col = scanner.next().charAt(0);

        room = new char[n][m];
        ans = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String row = scanner.next();
            for (int j = 0; j < m; j++)
                room[i][j] = row.charAt(j);
        }

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if (room[i][j] == col)
                    for (int k = 0; k < 4; k++) {
                        int tox = i + dirx[k];
                        int toy = j + diry[k];
                        if (valid(tox, toy) && room[tox][toy] != col && room[tox][toy] != '.')
                            ans.add(room[tox][toy]);
                    }
            }
        System.out.println(ans.size());
    }
}