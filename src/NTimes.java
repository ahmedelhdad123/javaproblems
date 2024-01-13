import java.util.Arrays;
import java.util.Scanner;

public class NTimes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        while (size-->0)
        {
            int number=scanner.nextInt();
            char character=scanner.next().charAt(0);
            char [] answer=doOperation(number,character);
            for (char a: answer)
            {
                System.out.print(a+ " ");
            }
            System.out.println();
        }
    }

    private static char[] doOperation(int number, char character) {
        char [] store=new char[number];
        Arrays.fill(store, character);
        return store;
    }


}
