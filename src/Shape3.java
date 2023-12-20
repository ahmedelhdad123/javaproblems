
/*
   Problem Link
   https://codeforces.com/group/MWSDmqGsZm/contest/219432/problem/W
 */
import java.util.Scanner;

public class Shape3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = size-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = size; i >= 0; i--) {
            for (int j = size-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
