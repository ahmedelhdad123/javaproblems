
/*
   Problem Link
   https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/Q
 */
import java.util.Scanner;

public class CountSubArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int counter=0;
        while (number-->0)
        {
            int size=scanner.nextInt();
            int [] store=new int[size];
            int result=size;
            for (int i=0;i<size;i++)
            {
                store[i]=scanner.nextInt();
            }
            int i=0,z=0;
            while (true) {
                if (z==size-1)
                {
                    break;
                }
                if (store[i]> store[i+1])
                {
                    z++;
                    i=z;
                    continue;
                }
                result++;
                i++;
                if (i == size - 1) {
                    z++;
                    i=z;
                }
            }
            System.out.println(result);
        }
    }
}

