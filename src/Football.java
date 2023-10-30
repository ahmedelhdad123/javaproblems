import java.util.*;

//problem link https://codeforces.com/contest/43/problem/A
public class Football {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int line=scanner.nextInt();
        String team1=scanner.next();
        int ans=1;
        int ans2=0;
        String team2="";
        for (int i=1;i<line;i++)
        {
            String word=scanner.next();
            if (!team1.equals(word))
            {
                team2=word;
                ans2++;
            }else
            {
                ans++;
            }
        }
        if (ans>=ans2)
        {
            System.out.println(team1);
        }else
        {
            System.out.println(team2);
        }

    }
}
