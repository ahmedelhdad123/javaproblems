import java.util.Scanner;

public class Xor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long a=scanner.nextLong();
        long b= scanner.nextLong();
        long q=scanner.nextLong();

        xor(a,b,q);

    }

    private static void xor(long a, long b, long q) {
        long result=q%3;
        if (result==1)
        {
            System.out.println(a);
        } else if (result==2) {
            System.out.println(b);
        }else
        {
            long f=a^b;
            System.out.println(f);
        }
    }
}
