import java.util.Scanner;

public class PrintFrom1ToN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        printFrom1ToN(n);
    }

    private static void printFrom1ToN(int n) {
        if (n <= 0){
            return;
        }
        printFrom1ToN(n-1);
        System.out.println(n);
    }
}
