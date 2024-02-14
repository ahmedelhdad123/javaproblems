import java.util.Arrays;
import java.util.Scanner;

public class BaseConverssion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        while (n-->0)
        {
            int number=scanner.nextInt();
            bestConversation(number);
            System.out.println();
        }
    }

    private static void bestConversation(int number) {
        if (number==0)
        {
            return;
        }
        bestConversation(number / 2);
        System.out.print(number % 2);
    }
}
