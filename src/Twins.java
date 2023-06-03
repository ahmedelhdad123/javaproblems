import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;
        int [] store=new int[n];
        for (int i=0;i<n;i++)
        {
            store[i]=scanner.nextInt();
            sum+=store[i];
        }
        Arrays.sort(store);
        int count=0;
        int res=0;
        for (int i=store.length-1;i>=0;i--)// 1 2 2
        {
            res+=store[i];
            count++;
            if(res>sum/2)
            {
                break;
            }
        }
        System.out.println(count);
    }
}
