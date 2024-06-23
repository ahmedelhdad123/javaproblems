package codeForces;

import java.util.Scanner;

public class LinelandMail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size=scanner.nextInt();
        int [] array =new int[size];
        int min=0;
        int max=0;
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            if(i == 0){
                min=Math.abs(array[i]-array[i+1]);
                max=Math.abs(array[i]-array[size-1]);
            } else if (i == size-1) {
                min=Math.abs(array[i]-array[i-1]);
                max=Math.abs(array[i]-array[0]);
            } else {
                min=Math.min(Math.abs(array[i]-array[i-1]),Math.abs(array[i]-array[i+1]));
                max=Math.max(Math.abs(array[i]-array[size-1]),Math.abs(array[i]-array[0]));
            }
            System.out.println(min+ " " + max);
        }

    }
}
