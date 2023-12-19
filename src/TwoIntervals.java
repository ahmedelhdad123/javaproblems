
/*
   Problem Link
   https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/X
 */
import java.util.Scanner;

public class TwoIntervals {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int l1=scanner.nextInt();
        int r1=scanner.nextInt();
        int l2=scanner.nextInt();
        int r2=scanner.nextInt();
        int x=0,y=0;
        if ((r1<l2 && l1<l2) || (r1>r2&&l1>r2))
        {
            System.out.println("-1");
        }else
        {
            if (l1>l2)
            {
                x=l1;
            }else
            {
                x=l2;
            }
            if (r1>r2)
            {
                y=r2;
            }else
            {
                y=r1;
            }
            System.out.println(x+" "+ y);
        }
    }
}
