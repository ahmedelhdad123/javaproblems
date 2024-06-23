package codeForces;
/*
    Problem Link
    https://codeforces.com/contest/688/problem/B
 */
import java.util.Scanner;

public class LovelyPalindromes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String store=scanner.next();
        StringBuilder copyStore=new StringBuilder(store);
        copyStore.reverse();
        String result=store+copyStore;
        System.out.println(result);
    }
}
