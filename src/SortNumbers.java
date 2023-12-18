
/*
   Problem Link
   https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/T
 */
import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] store=new int[3];


        for (int i=0;i<3;i++)
        {
            store[i] =scanner.nextInt();
        }
        int []copyStore=Arrays.copyOf(store,store.length);
        Arrays.sort(store);
        for (int i=0;i<3;i++)
        {
            System.out.println(store[i]);
        }
        System.out.println();
        for (int i=0;i<3;i++)
        {
            System.out.println(copyStore[i]);
        }

    }
}
