
//Problem Link http://codeforces.com/contest/404/problem/A
import java.util.Scanner;

public class ValeraAndX {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        char[][]store= new char[n][n];
        char first,sec;
        boolean check=false;
        for (int i=0;i<store.length;i++){
            String s=scanner.next();
            for (int j=0;j<store[i].length;j++)
            {
                store[i][j]=s.charAt(j);
                first=store[0][0];
                sec=store[0][1];
                if (i==j)
                {
                    if (first!=store[i][j])
                    {
                        check=true;
                    }
                } else if (i==n-1-j) {
                    if (first!=store[i][j])
                    {
                        check=true;
                    }
                }else
                {
                    if (sec!=store[i][j]||first==store[i][j])
                    {
                        check=true;
                    }
                }

            }
                if (check)
                 {
                    break;
                 }
        }
        if (check)
        {
            System.out.println("NO");
        }else
        {
            System.out.println("YES");
        }
    }
}
