import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long number=scanner.nextLong();
        System.out.println(number==2?"NO":number%2==0?"YES":"NO");
    }
}
