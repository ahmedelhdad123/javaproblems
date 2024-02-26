
import java.util.Scanner;

public class FibonacciRec {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        System.out.println(fibonacciRec(size));
    }

    private static long fibonacciRec(int size) {
        if (size==1)
        {
            return 0;
        }else if (size==2)
        {
           return 1;
        }else
        {
            return fibonacciRec(size-1)+fibonacciRec(size-2);
        }
    }
}
