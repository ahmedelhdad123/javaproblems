
/*
     Problem link
     https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/U
 */
import java.util.Scanner;

public class IsBaSubsequenceOfA {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sizeO=scanner.nextInt();
        int sizeSub=scanner.nextInt();
        int []storeO=new int[sizeO];
        int []storeSub=new int[sizeSub];
        for (int i=0;i<sizeO;i++)
        {
            storeO[i]=scanner.nextInt();
        }
        for (int i=0;i<sizeSub;i++)
        {
            storeSub[i]=scanner.nextInt();
        }
        boolean check=true;
        int i=0,j=0;

        while (check)
        {
            if (storeO[i]==storeSub[j])
            {
                i++;
                j++;
            }else
            {
                i++;
            }
            if (j==sizeSub)
            {
                System.out.println("YES");
                check=false;
            }else if (i==sizeO)
            {
                System.out.println("NO");
                break;
            }
        }
    }
}
