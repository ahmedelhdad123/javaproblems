
/*
     Problem Link
     https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/V
 */
import java.util.Arrays;
import java.util.Scanner;

public class FrequencyArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int check= scanner.nextInt();
        int [] store=new int[size];
        int [] freq=new int[check+1];
        for (int i=0;i<size;i++)
        {
           store[i]=scanner.nextInt();
           int num=store[i];
           freq[num]++;
        }
        for (int i=1;i<check+1;i++)
        {
            System.out.println(freq[i]);
        }

    }
}
