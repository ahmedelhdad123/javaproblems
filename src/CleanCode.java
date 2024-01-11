import java.util.Scanner;

public class CleanCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        int open = 1;

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            boolean flag = false;

            if (line.trim().isEmpty()) {
                continue;
            }

            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '/' && i + 1 < line.length() && line.charAt(i + 1) == '/' && open == 1) {
                    break;
                } else if (line.charAt(i) == '/' && i + 1 < line.length() && line.charAt(i + 1) == '*') {
                    i++;
                    open = 0;
                } else if (line.charAt(i) == '*' && i + 1 < line.length() && line.charAt(i + 1) == '/' && open == 0) {
                    i++;
                    open = 1;
                } else if (open == 1) {
                    System.out.print(line.charAt(i));
                    flag = true;
                }
            }

            if (flag && open == 1) {
                System.out.println();
            }
        }
    }
}