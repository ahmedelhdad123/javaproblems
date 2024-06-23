package codeForces;
/*
    Problem Link
    https://codeforces.com/group/MWSDmqGsZm/contest/219856/problem/B
 */
import java.util.Scanner;

public class LetUseGetLine {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();
        String store="";
        for (int i=0;i<line.length();i++)
        {
            if (line.charAt(i)=='\\')
            {
                break;
            }else
            {
                store=store+line.charAt(i);
            }
        }
        System.out.println(store);

    }

}
