package codeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class URL {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.next();
        String store="";
        ArrayList<String> test=new ArrayList<>();
        for (int i=0;i<input.length()-1;i++)
        {
            if (input.charAt(i)=='=')
            {
                for (int x=i+1;x<input.length();x++)
                {
                    if (input.charAt(x)!='&')
                    {
                        store=store+input.charAt(x);
                    }else
                    {
                        i=x;
                        test.add(store);
                        store="";
                        break;
                    }
                }
            }
        }
        test.add(store);
        System.out.println("username: "+test.get(0));
        System.out.println("pwd: "+test.get(1));
        System.out.println("profile: "+test.get(2));
        System.out.println("role: "+test.get(3));
        System.out.println("key: "+test.get(4));
    }
}
