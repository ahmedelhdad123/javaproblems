package codeForces;

import java.util.Scanner;

public class AlyonaAndNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long firstNumber,secondNumber;
        firstNumber=scanner.nextLong();
        secondNumber=scanner.nextLong();
        long [] storeF=new long[5];
        long [] storeS=new long[5];
        for (int i=1;i<=firstNumber;i++)
        {
            storeF[i%5]++;
        }
        for (int i=1;i<=secondNumber;i++)
        {
            storeS[i%5]++;
        }
        System.out.println(storeF[0] * storeS[0] + storeF[1] * storeS[4] + storeF[2] * storeS[3] + storeF[3] * storeS[2] + storeF[4] * storeS[1]);
    }
}
