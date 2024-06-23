package codeForces;

import java.util.*;

public class Pangram {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n=scanner.nextInt();
        if (n<26)
        {
            System.out.println("NO");
            return;
        }
        String z=scanner.next();
        String s=z.toLowerCase();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        s=new String(chars);
        Set<Character> characters=new HashSet<>();
        for (int i=0;i<s.length();i++)
        {
                characters.add(s.charAt(i));
        }
        if (characters.size()>=26)
        {
                System.out.println("YES");
        }else
        {
                System.out.println("NO");
        }
    }
}
/*
if (n<26)
        {
            System.out.println("NO");
            return;
        }
        String z=scanner.next().toLowerCase();
        int count=0;
        for (int i=97;i<=122;i++)
        {
                if(value.contains((char)i+"")
                {
                   count++
                 }
        }
        if (count)>=26)
        {
                System.out.println("YES");
        }else
        {
                System.out.println("NO");
        }
 */
