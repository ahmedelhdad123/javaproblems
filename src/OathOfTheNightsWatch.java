import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class OathOfTheNightsWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int count =0;
        int [] store=new int[n];
        for (int i=0;i<n;i++)
        {
            store[i]=scanner.nextInt();
        }
        if(n<=2)
        {
            System.out.println("0");
        }else {
            Arrays.sort(store);
            for (int i=1;i<store.length;i++)
            {
                if(store[i]>store[0]&&store[i]<store[n-1])
                {
                    count++;
                }
            }
            System.out.println(count);
        }

    }

}
