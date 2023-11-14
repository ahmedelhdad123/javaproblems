
/*
  Problem Link
  https://codeforces.com/contest/158/problem/A
 */
import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOfPlayer=scanner.nextInt();
        int score=scanner.nextInt();
        int [] store=new int[numberOfPlayer];
        int count =0;
        for (int i=0;i<numberOfPlayer;i++)
        {
            store[i]=scanner.nextInt();
        }
        int con=store[score-1];
        for (int i=0;i<numberOfPlayer;i++)
        {
            if (store[i]>=con&&store[i]>0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
