import java.util.Scanner;

public class TwoLines {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();

        int answer1=(y2-y1)*(x4-x3);
        int answer2=(y4-y3)*(x2-x1);

        if (answer2==answer1)
        {
            System.out.println("YES");
        }else
        {
            System.out.println("NO");
        }

    }
}
