import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        long r = scanner.nextLong();
        long m = scanner.nextLong();
        long answer = productModulo(l, r, m);
        System.out.println(answer);
    }

    private static long productModulo(long l, long r, long m) {
        long result = 1;
        for (long i = l; i <= r; i++) {
           // result = (result * (i % m)) % m;
            result = (result * i) % m;
        }
        return result;
    }
}
