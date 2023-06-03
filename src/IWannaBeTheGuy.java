import java.util.ArrayList;
import java.util.Scanner;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int [] store=new int[n+1];
        int x=scanner.nextInt();
        int count=0;
        for (int i=0;i<x;i++)
        {
            int a=scanner.nextInt();
            store[a]++;
        }
        int y=scanner.nextInt();
        for (int i=0;i<y;i++)
        {
            int a=scanner.nextInt();
            store[a]++;
        }
        for (int i=1;i<store.length;i++)
        {
            if(store[i]==0)
            {
                count++;
            }
        }
        if (count!=0)
        {
            System.out.println("Oh, my keyboard!");
        }else
        {
            System.out.println("I become the guy.");
        }

    }
}
