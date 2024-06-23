package codeForces;
/*
   Problem Link
   https://codeforces.com/group/MWSDmqGsZm/contest/219856/problem/H
 */
import java.util.Scanner;

public class GoodOrBad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        while (size-->0){
            String store = scanner.next();
            if (isGoodString(store)) {
                System.out.println("Good");
            } else {
                System.out.println("Bad");
            }
        }
    }

    private static boolean isGoodString(String s) {
        String check1 = "010";
        String check2 = "101";

        for (int i = 0; i < s.length() - 2; i++) {
            String subStr = s.substring(i, i + 3);
            if (subStr.equals(check1) || subStr.equals(check2)) {
                return true;
            }
        }
        return false;
    }
}
