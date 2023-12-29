
/*
   Problem Link
   https://codeforces.com/group/MWSDmqGsZm/contest/219856/problem/G
 */
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();
        String answer=swapCase(line);
        System.out.println(answer.replace(',',' '));
    }
    static String swapCase(String input)
    {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isUpperCase(currentChar))
            {
                result.append(Character.toLowerCase(currentChar));
            }else
            {
                result.append(Character.toUpperCase(currentChar));
            }
        }
        return result.toString();
    }
}
