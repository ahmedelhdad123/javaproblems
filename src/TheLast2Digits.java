
/*
   Problem Link
   https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/Y
 */
import java.util.Scanner;

public class TheLast2Digits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long a=scanner.nextLong();
        long b=scanner.nextLong();
        long c=scanner.nextLong();
        long d=scanner.nextLong();
        a=a*b%100;
        a=a*c%100;
        a=a*d%100;
        if (a==0)
        {
            System.out.println("00");
        }else if (a<9)
        {
            System.out.println("0"+a);
        }else
        {
            System.out.println(a);
        }
    }
}
