import java.util.Scanner;

public class SuffixSum {
    static long sum=0;
    static int i;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        long [] store=new long[n];
        for (int i=0;i<n;i++)
        {
            store[i]=scanner.nextLong();
        }
        i=store.length-1;
        suffixSum(store,m,i);
        System.out.println(sum);
    }

    private static long suffixSum(long[] store, int m, int i) {
        if (m==0)
        {
            return sum;
        }
        sum+=store[i];
        return suffixSum(store,m-1,i-1);
    }
}
