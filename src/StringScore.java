import java.util.Arrays;
import java.util.Scanner;

public class StringScore {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        String store=scanner.next();
        System.out.println(calculateScore(store));
    }
    public static int calculateScore(String string) {
        int score = 0;
        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            if (currentChar == 'V') {
                score += 5;
            } else if (currentChar == 'W') {
                score += 2;
            } else if (currentChar == 'X') {
                if (i < chars.length - 1) {
                    chars[i + 1] = '0';
                }
            } else if (currentChar == 'Y') {
                if (i < chars.length - 1) {
                    char temp = chars[i + 1];
                    for (int x = i + 1; x < chars.length - 1; x++) {
                        chars[x]=chars[x+1];
                    }
                    chars[chars.length-1]=temp;
                }
            } else if (currentChar == 'Z') {
                if (i < chars.length - 1) {
                    if (chars[i + 1] == 'V') {
                        score /= 5;
                        chars[i+1] = '0';
                    } else if (chars[i + 1] == 'W') {
                        score /= 2;
                        chars[i+1] = '0';
                    }
                }
            }
        }

        return score;
    }
}
