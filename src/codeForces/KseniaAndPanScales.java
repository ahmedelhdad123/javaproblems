package codeForces;
/*
  Problem Link
  https://codeforces.com/contest/382/problem/A
 */
import java.util.Scanner;

public class KseniaAndPanScales {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();
        String inPut=scanner.next();
        String left="",right="";
        int cross=line.indexOf("|");
        left=line.substring(0,cross);
        right=line.substring(cross+1);
        for (char pointer : inPut.toCharArray())
        {
            if (left.length()<=right.length())
            {
                left += pointer;
            }else
            {
                right+=pointer;
            }
        }
        String result = (left.length() == right.length()) ? (left + "|" + right):"Impossible";
        System.out.println(result);
    }
}
