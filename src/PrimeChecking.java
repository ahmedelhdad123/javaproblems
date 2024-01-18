import java.util.Scanner;

public class PrimeChecking {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long input=scanner.nextLong();
        if(IsPrime(input))
        {
            System.out.println("YES");
        }else
        {
            System.out.println("NO");
        }
    }

    private static boolean IsPrime(Long input) {
        if (input<2)
        {
            return false;
        }else
        {
            for (int i=2;i<=Math.sqrt(input);i++)
            {
                if (input%i==0)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
