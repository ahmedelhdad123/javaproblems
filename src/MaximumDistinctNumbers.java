import java.util.Scanner;

public class MaximumDistinctNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long input= scanner.nextLong();
        maximumDistinctNumbers(input);
    }

    private static void maximumDistinctNumbers(long input) {
        int count = (int) ((-1+Math.sqrt(1+8*input))/2);
        System.out.println(count);
    }
}
