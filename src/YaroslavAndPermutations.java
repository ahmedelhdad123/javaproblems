
/*
 Problem Link
 https://codeforces.com/contest/296/problem/A
 */
import java.util.Scanner;

public class YaroslavAndPermutations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int [] store=new int[size];

        for (int i=0;i<size;i++)
        {
            store[i]=scanner.nextInt();
        }
        boolean check=true;
        for (int i=0;i<size;i++)
        {
            int count=0;
            for (int j=0;j<size;j++)
            {
                if (store[i]==store[j])
                {
                    count++;
                }
            }
            if (size<2*count-1)
            {
                check=false;
                break;
            }
        }
       // System.out.println(countD + " " + countS);
        String result= check ? "YES" : "NO";

        System.out.println(result);

    }
}
