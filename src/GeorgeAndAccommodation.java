import java.util.Scanner;

public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long number=scanner.nextLong();
        long count=0;
        while (number-->0)
        {
            long num1=scanner.nextLong();
            long num2=scanner.nextLong();
            if (num2-num1>=2)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
