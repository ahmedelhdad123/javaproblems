package leetCode;

import java.util.Scanner;

public class MaxNumber {
    static int max;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int [] store=new int[number];
        for (int i = 0; i < number; i++) {
            store[i] = scanner.nextInt();
        }
         max=store[0];
        maxumber(store,0);
        System.out.println(max);
    }

    private static int maxumber(int[] store, int i) {
        if (i==store.length)
        {
            return max;
        }
        if (store[i]>max)
        {
            max=store[i];
        }
       return maxumber(store,i+1);
    }


}
