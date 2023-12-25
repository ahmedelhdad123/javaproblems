
/*
   Problem Link
  https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/R
 */
import java.util.Arrays;
import java.util.Scanner;

public class PermutationWithArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int [] store=new int[size];
        int [] permutationStore=new int[size];

        for (int i=0;i<size;i++)
        {
            store[i]=scanner.nextInt();
        }
        for (int i=0;i<size;i++)
        {
            permutationStore[i]=scanner.nextInt();
        }
        Arrays.sort(store);
        Arrays.sort(permutationStore);
        for (int i=0;i<size;i++)
        {
            if (store[i]!=permutationStore[i])
            {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
