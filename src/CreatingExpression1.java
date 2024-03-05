import java.util.Scanner;

public class CreatingExpression1 {
    static int size;
    static long result;
    static long[] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        result = scanner.nextLong();
        arr = new long[21];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextLong();
        }
        if (check(arr[0], 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean check(long sum, int index) {
        if (index == size) {
            return sum == result;
        }
        boolean route1 = check(sum + arr[index], index + 1);
        boolean route2 = check(sum - arr[index], index + 1);
        return route1 || route2;
    }
}
