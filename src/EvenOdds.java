import java.util.*;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n=scanner.nextLong();
        long k=scanner.nextLong();
        long index=0;

        if(n%2==0)
        {
            index=n/2;
        }else
        {
            index=(n/2)+1;
        }
        if(k<=index)
        {
            System.out.println((k*2)-1);
        }else
        {
            System.out.println((k-index)*2);
        }

    }
}
