package codeForces;

import java.math.BigInteger;
import java.util.Scanner;

public class BigAddAndMultiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number=scanner.next();

        BigInteger bigInteger1=new BigInteger(number);
        BigInteger bigInteger2=new BigInteger("9999");

        BigInteger sumResult=bigInteger1.add(bigInteger2);
        BigInteger productResult=bigInteger1.multiply(bigInteger2);
        System.out.println(sumResult);
        System.out.println(productResult);
    }
}
