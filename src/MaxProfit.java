
/*
   LeetCode ProblemLink
   https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
import java.util.*;

public class MaxProfit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int [] prices=new int[n];
        for (int i=0;i<n;i++)
        {
            prices[i]=scanner.nextInt();
        }
        int maxProfit=0;
        int minProfit=prices[0];
        if (prices.length<2)
        {
            System.out.println(0);
            return;
        }
        for (int i=1;i<n;i++)
        {
            minProfit=Math.min(minProfit,prices[i]);
            maxProfit=Math.max(maxProfit,prices[i]-minProfit);
        }
        System.out.println(maxProfit);
    }
}
/*
 List<Integer> store=new ArrayList<>();
        if (prices.length<=1)
        {
            System.out.println(0);
        }
        else
        {
            for (int i=0;i<prices.length;i++)
            {
                for (int j=i+1;j<prices.length;j++)
                {
                    store.add(prices[j]-prices[i]);
                }
            }
            if (Collections.max(store)>0)
            {
                System.out.println(Collections.max(store));
            }else
            {
                System.out.println(0);
            }
        }
 */
