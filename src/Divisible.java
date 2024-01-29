import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String n=scanner.next();
        long x=scanner.nextLong();

        divisible(n,x);
    }

    private static void divisible(String n, long x) {
       long result=0;
       for(int i=0;i<n.length();i++){
           result*=10;
           result+=n.charAt(i)-'0';
           result%=x;
       }
       if (result == 0)
       {
           System.out.println("YES");
       }else
       {
           System.out.println("NO");
       }
    }
}
