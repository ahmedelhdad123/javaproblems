
/*
   Problem Link
   https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/P
 */
import java.util.Scanner;

public class MinimizeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int [] store=new int[size];
        for (int i=0;i<size;i++)
        {
            store[i]=scanner.nextInt();
        }
        int counter=0;
        boolean check=true;
        while (check)
        {
            for (int i=0;i<size;i++)
            {
                if (store[i]%2==0)
                {
                    store[i]=store[i]/2;
                }else
                {
                    check=false;
                    break;
                }
            }
            if (check)
            {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
