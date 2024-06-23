package codeForces;
//   Problem Link    https://codeforces.com/contest/431/problem/A


import java.util.HashMap;
import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        HashMap<Integer,Integer> store=new HashMap<>();
        for (int i=1;i<=4;i++)
        {
            store.put(i,scanner.nextInt());
        }
        int sum=0;
        String line=scanner.next();
        char [] character=line.toCharArray();
        for (int i=0;i<line.length();i++)
        {
            sum+=store.get(character[i]-48);
        }
        System.out.println(sum);
    }
}
