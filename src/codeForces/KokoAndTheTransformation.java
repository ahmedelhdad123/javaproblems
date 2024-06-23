package codeForces;

import java.util.Scanner;

public class KokoAndTheTransformation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numOfArray1=scanner.nextInt();
        int numOfArray2=scanner.nextInt();
        int sum1=0,sum2=0;
        int [] array1=new int[numOfArray1];
        int [] array2=new int[numOfArray2];
        for (int i=0;i<numOfArray1;i++){
            array1[i]=scanner.nextInt();
            sum1+=array1[i];
        }
        for (int i=0;i<numOfArray2;i++){
            array2[i]=scanner.nextInt();
            sum2+=array2[i];
        }
        System.out.println(sum1==sum2?"Yes":"No");

    }
}
