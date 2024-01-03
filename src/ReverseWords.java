import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder store = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        char check = ' ';
        StringBuilder reverse = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == check) {
                reverse.append(store);
                reverse.reverse();
                answer.append(reverse).append(" ");
                store = new StringBuilder();
                reverse.delete(0, reverse.length());
            } else {
                store.append(input.charAt(i));
            }
        }
        reverse.append(store);
        reverse.reverse();
        answer.append(reverse);

        System.out.println(answer);
    }
}
