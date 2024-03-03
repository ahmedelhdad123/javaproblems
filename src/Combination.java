import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int r=scanner.nextInt();
        if (r>n)
        {
            System.out.println(0);
        }else
        {
            System.out.println(fact(n,r));
        }
    }
    static long fact(long number,long number2)
    {
        long result=1;
        long temp=2;
        for (int i = (int) (number2+1); i<=number; i++)
        {
            result *=i;
            if (temp<=number-number2 && result%temp==0)
            {
                result/=temp;
                temp++;
            }
        }
        return result;
    }

}
