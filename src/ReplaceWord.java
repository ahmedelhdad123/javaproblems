import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = input.replaceAll("EGYPT", " ");
        System.out.println(result);

    }
}
/*
StringBuilder answer = new StringBuilder(input);
        String store = "";
        String test = "EGYPT";
 for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == 'E') {
                int x = i;
                for (; x < answer.length(); x++) {
                    store = store + answer.charAt(x);
                    if (store.length()==5)
                    {
                        break;
                    }
                }
                if (test.equals(store)) {
                    answer.replace(i, i + test.length(), " ");
                }
                store = "";
            }
        }
        System.out.println(answer);

 */
