package leetCode;
/*
  Problem Link
  https://codeforces.com/contest/746/problem/B
 */
import java.util.Scanner;

public class Decoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String input = scanner.next();
        StringBuilder store=new StringBuilder();
        store.append(input.charAt(0));
        for (int i=1;i<size;i++)
        {
            if (i%2==0)
            {
                store.append(input.charAt(i));
            }else
            {
                store.insert(0,input.charAt(i));
            }
        }
        if (size%2==0)
        {
            System.out.println(store.reverse());
        }else
        {
            System.out.println(store);
        }
    }
}
