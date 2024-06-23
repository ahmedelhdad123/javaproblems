package codeForces;
/*
     Problem Link
     https://codeforces.com/contest/47/problem/B
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String coins1 = scanner.next();
        String coins2 = scanner.next();
        String coins3 = scanner.next();
        String store = coins1 + coins2 + coins3;
//        HashMap<Character,Integer> result=new HashMap<>();
//        result.put('A',0);
//        result.put('B',0);
//        result.put('C',0);
        int countA=0,countB=0,countC=0;
        for (int i = 0; i < store.length(); i++) {
            if (store.charAt(i) == '>') {
                if (store.charAt(i-1)=='A')
                {
                    countA++;
                }else if (store.charAt(i-1)=='B')
                {
                    countB++;
                }else
                {
                    countC++;
                }
            } else if (store.charAt(i) == '<') {
                if (store.charAt(i + 1)=='A')
                {
                    countA++;
                }else if (store.charAt(i + 1)=='B')
                {
                    countB++;
                }else
                {
                    countC++;
                }
            }
        }
        if (countA<countB&&countA<countC&&countB<countC)
        {

                System.out.println("ABC");

        }else if (countB<countA&&countB<countC&&countA<countC)
        {

                System.out.println("BAC");

        } else if (countC<countA&&countC<countB&&countB<countA)
        {
              System.out.println("CBA");

        }else if (countB<countA&&countB<countC&&countC<countA)
        {

                System.out.println("BCA");

        }else if (countC<countA&&countC<countB&&countA<countB)
        {

                System.out.println("CAB");

        }else if (countA<countB&&countA<countC&&countC<countB)
        {

                System.out.println("ACB");

        }else
        {
            System.out.println("Impossible");
        }



    }
}
