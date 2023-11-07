
// Problem Link    https://codeforces.com/contest/731/problem/A

import java.util.Scanner;

public class NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.next();
        char [] store=line.toCharArray();
        int moves=0 , start=0;
        for (int i=0;i<store.length;i++)
        {
            int index=store[i]-97;
            int walk=Math.abs(start-index);
            if (walk<13)
            {
                moves+=walk;
            }else
            {
                moves+=26-walk;
            }
            start=index;
        }
        System.out.println(moves);

    }
}
