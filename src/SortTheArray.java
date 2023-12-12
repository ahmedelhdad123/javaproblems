
/*
   Problem Link
   https://codeforces.com/contest/451/problem/B
 */
import java.util.Arrays;
import java.util.Scanner;

public class SortTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size=scanner.nextInt();
        int [] store=new int[size];
        int [] increase=new int[size];
        int l=-1,r=-1;
        for (int i=0;i<size;i++)
        {
            store[i]=scanner.nextInt();
            increase[i]=store[i];
        }
        Arrays.sort(increase);
        for (int i=0;i<size;i++)
        {
            if (store[i]!=increase[i])
            {
                l=i;
                break;
            }
        }
        for (int i=size-1;i>=0;i--)
        {
            if (store[i]!=increase[i])
            {
                r=i;
                break;
            }
        }
        if (l==-1)
        {
            System.out.println("yes\n1 1");
            return;
        }
        reverse(store,l,r);
        for (int i=0;i<size;i++)
        {
            if (store[i]!=increase[i])
            {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
        System.out.println((l+1) + " " + (r+1));
    }
    static void reverse(int [] arr,int l,int r)
    {
        int [] t=new int[arr.length];
        for (int i=l,j=r ;i<=r;i++,j--)
        {
            t[i]=arr[j];
        }
        for(int i=l; i<=r; i++) {
            arr[i] = t[i];
        }
    }
}
