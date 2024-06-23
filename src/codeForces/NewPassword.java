package codeForces;
/*
   Problem Link
   https://codeforces.com/contest/770/problem/A
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewPassword {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        List<Character> characters=new ArrayList<>();
        List<Character> password=new ArrayList<>();
        for(int i=97;i<97+k;i++)
        {
            characters.add((char)i);
        }
        int pointer=0;
        for (int i=0;i<n;i++)
        {
            password.add(characters.get(pointer));
            if(pointer == characters.size()-1)
            {
                pointer = 0;
            }else
            {
                pointer++;
            }
        }
        String a="";
        for (int i=0;i<password.size();i++)
        {
            a+=password.get(i);
        }
        System.out.println(a);
    }
}
/*
        int numberOfLength=scanner.nextInt();
        int numberOfDistinctSymbols=scanner.nextInt();
        String store="";
        char [] character={'0','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int count =1;
        for (int i=0;i<numberOfLength;i++)
        {
            if (count!=numberOfDistinctSymbols)//2
            {
                store+=character[count];
                count++;
            }else
            {
                store+=character[count];
                count=1;
            }
        }
        System.out.println(store);
 */