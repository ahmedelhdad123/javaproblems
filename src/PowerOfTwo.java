import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        if (isPowerOfTwo(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
    private static boolean isPowerOfTwo(long n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }

}
/*

    long n = scanner.nextLong();
        if (n<0)
        {
            System.out.println("No");
            return;
        }
        double answer=Math.log(n)/Math.log(2);
        if ((answer - (int) answer) != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

 */
