
/*
   Problem Link
   https://codeforces.com/contest/282/problem/A
 */
import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOfOperation=scanner.nextInt();
        int sum=0;
        for (int i=0;i<numberOfOperation;i++)
        {
            String operation=scanner.next();
            for (int j=0;j<operation.length();j++)
            {
                if (operation.charAt(j)=='+')
                {
                    sum+=1;
                    break;
                }else if (operation.charAt(j)=='-')
                {
                    sum-=1;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
