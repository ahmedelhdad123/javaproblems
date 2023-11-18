
/*
  Problem Link
  https://codeforces.com/contest/218/problem/A
 */
import java.util.Scanner;

public class MountainScenery {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int []store=new int[2*n+1];
        int count=0;
        for (int i=0;i<store.length;i++)
        {
            store[i]=scanner.nextInt();
        }
        for (int i = 1; i < store.length-1; i++) {
            if (count != k) {
                if (store[i] > store[i - 1]+1 && store[i] > store[i + 1]+1) {
                    store[i]--;
                    count++;
                }
            }
        }
        for (int i=0;i<store.length;i++)
        {
            System.out.println(store[i]);
        }

    }
}
