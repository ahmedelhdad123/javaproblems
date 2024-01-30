import java.util.Scanner;

public class ConvertToBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ca = scanner.nextInt();
        if (ca == 1) {
            String arr = scanner.next();
            long base = scanner.nextLong();
            System.out.println(toDec(arr, base));
        } else {
            long number = scanner.nextLong();
            long base = scanner.nextLong();
            char[] res = new char[100];
            System.out.println(fromDec(res, base, number));
        }
    }

    private static long num(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        } else {
            return c - 'A' + 10;
        }
    }

    private static char reNum(long num) {
        if (num >= 0 && num <= 9) {
            return (char) (num + '0');
        } else {
            return (char) (num + 'A' - 10);
        }
    }

    private static long toDec(String value, long base) {
        long size = value.length();
        long power = 1;
        long result = 0;
        for (int i = (int) size - 1; i >= 0; i--) {
            result += num(value.charAt(i)) * power;
            power *= base;
        }
        return result;
    }

    private static String fromDec(char[] res, long base, long number) {
        int index = 0;
        while (number > 0) {
            res[index++] = reNum(number % base);
            number /= base;
        }
        reverse(res, 0, index - 1);
        return new String(res, 0, index);
    }

    private static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
