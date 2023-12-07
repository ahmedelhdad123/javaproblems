
/*
 Problem Link
 https://codeforces.com/contest/78/problem/B
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOfEggs=scanner.nextInt();
        List<Character> store=new ArrayList<>();
        store.add('R');
        store.add('O');
        store.add('Y');
        store.add('G');
        store.add('B');
        store.add('I');
        store.add('V');
        String result="";
        int j=0;
        int counter=3;
        for (int i=0;i<numberOfEggs;i++)
        {
            if (j<=6)
            {
                result+=store.get(j);
                j++;
            }else
            {
                j=3;
                result+=store.get(j);
                j++;
                counter++;
            }

        }
        System.out.println(result);
    }
}
