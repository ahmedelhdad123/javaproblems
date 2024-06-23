package codeForces;
/*
  Problem Link
  https://codeforces.com/group/MWSDmqGsZm/contest/219432/problem/X
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ConvertToDecimal2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int result=0;
        int a=0;
        ArrayList <Integer> store=new ArrayList<>();
        ArrayList<Integer> finalResult=new ArrayList<>();
        for (int i=0;i<size;i++)
        {
            int number=scanner.nextInt();
            while (number>0)
            {
                store.add(number % 2);
                number = number / 2;
            }
            store.removeIf(element -> element == 0);
            for (int b=0;b<store.size();b++)
            {
                result+= (int) Math.pow(2,a);
                a++;
            }
            a=0;
            finalResult.add(result);
            result=0;
            store.clear();

        }
        for (int i=0;i<finalResult.size();i++)
        {
            System.out.println(finalResult.get(i));
        }

    }
}
