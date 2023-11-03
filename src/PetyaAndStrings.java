
// Problem Link    https://codeforces.com/contest/112/problem/A

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine=scanner.next().toLowerCase();
        String secondLine=scanner.next().toLowerCase();
        int cheek=firstLine.compareTo(secondLine);

        if (cheek==0)
        {
            System.out.println("0");
        } else if (cheek>0){
            System.out.println("1");


        }else
        {
        System.out.println("-1");
        }
    }
}
