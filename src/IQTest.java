
/*
  Problem Link
  https://codeforces.com/contest/287/problem/A
 */
import java.util.Scanner;

public class IQTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String input = "";
        for (int i = 0; i < 4; i++) {
            input += scanner.next();
        }
        char[][] store = new char[4][4];
        int index = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                store[i][j] = input.charAt(index++);
            }
        }
        boolean check=false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int black=0,white=0;
                if (store[i][j]=='#')
                {
                    black++;
                }else
                {
                    white++;
                }
                if (store[i][j+1]=='#')
                {
                    black++;
                }else
                {
                    white++;
                }
                if (store[i+1][j]=='#')
                {
                    black++;
                }else
                {
                    white++;
                }
                if (store[i+1][j+1]=='#')
                {
                    black++;
                }else
                {
                    white++;
                }
                if (black>=3||white>=3)
                {
                    check=true;
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
