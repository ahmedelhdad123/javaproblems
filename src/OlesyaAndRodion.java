import java.util.Scanner;

//problem link https://codeforces.com/contest/584/problem/A
public class OlesyaAndRodion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int t=scanner.nextInt();
        String check="";
        if(n<2&&t==10)
        {
            System.out.println("-1");
        }else if (n>=2 && t==10)
        {
            for (int i=0;i<n-1;i++)
            {
                check+=1;
            }
            System.out.println(check+0);
        }else{
            for (int i=0;i<n;i++)
            {
                check+=t;
            }
            System.out.println(check);
        }

    }
}
