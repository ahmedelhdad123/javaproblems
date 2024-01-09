
/*
   Problem Link
   https://codeforces.com/group/MWSDmqGsZm/contest/219856/problem/X
 */
import java.util.Arrays;
import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(smallestString(input));
    }

    public static String sortString(String string) {
        char[] charArray = string.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static String smallestString(String s) {
        int n = s.length();

        String smallest = s;
        for (int i = 1; i < n; i++) {
            String part1 = s.substring(0, i);
            String part2 = s.substring(i);


            String sortedPart1 = sortString(part1);
            String sortedPart2 = sortString(part2);

            String newString = sortedPart1 + sortedPart2;


            smallest = smallest.compareTo(newString) < 0 ? smallest : newString;
        }

        return smallest;
    }
}
