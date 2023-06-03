import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SnackTower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int max=n;
        int []arr =new int[n+1];
        for (int i=0;i<n;i++)
        {
            int num=scanner.nextInt();
            arr[num]=1;
            while (arr[max] == 1)
            {
                System.out.print(max + " ");
                max--;
            }
            System.out.println();
        }

    }
}
/*
 int [] check =new int[n+1];
        int [] array=new int[n];
        ArrayList<Integer> store =new ArrayList<>();
        for (int i=0;i<n;i++)
        {
            check[i]=scanner.nextInt();
        }
        for (int i=0;i<check.length-1;i++)//4 5 1 2 3
        {
            if(check[i]>check[i+1])
            {
                if(store.isEmpty())
                {
                    System.out.println(check[i]);
                }else
                {
                    System.out.print(check[i]);
                    System.out.println(store);
                    Collections.reverse(store);
                    store.clear();
                }
            }else
            {
                System.out.println(" ");
                store.add(check[i]);

            }
        }
 */
