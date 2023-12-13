
/*
   Problem Link
   https://codeforces.com/contest/810/problem/B
 */
import java.util.*;

public class SummeSellOff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int choice = scanner.nextInt();

        long [] store=new long[size];
        long sum=0;
        for (int i = 0; i < size; i++) {
            int products=scanner.nextInt();
            int people=scanner.nextInt();
            sum+=Math.min(products,people);
            if (people>products)
            {
                store[i]=Math.min(products*2,people) - Math.min(products,people);
            }else
            {
                store[i]=0;
            }
        }
        Arrays.sort(store);
        int counter=0;
        for (int i =store.length-1;i>=0;i--)
        {
            if (counter==choice)
            {
                break;
            }else
            {
                sum+=store[i];
                counter++;
            }
        }
        System.out.println(sum);
    }
}
