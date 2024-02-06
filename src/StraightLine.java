import java.util.Scanner;

public class StraightLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 3;
        int[] arrX = new int[n];
        int[] arrY = new int[n];
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            arrX[i] = x;
            arrY[i] = y;
        }
        System.out.println(distance(arrX, arrY));
    }

    private static String distance(int[] arrX, int[] arrY) {

        int slope1 = (arrY[1] - arrY[0]) * (arrX[2] - arrX[1]);
        int slope2 = (arrY[2] - arrY[1]) * (arrX[1] - arrX[0]);

        if (slope1 == slope2) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
