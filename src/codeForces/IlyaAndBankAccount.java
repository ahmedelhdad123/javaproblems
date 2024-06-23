
// https://codeforces.com/group/MWSDmqGsZm/contest/223206/problem/U
package codeForces;

import java.util.Scanner;

public class IlyaAndBankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        if (balance > 0) {
            System.out.println(balance);
        }else
        {
            int temp1 = balance;
            temp1 = temp1/10;
            int temp2 = removeDigitBeforeLastDigit(balance);
            if (temp2 >= temp1){
                System.out.println(temp2);
            }else {
                System.out.println(temp1);
            }
        }
    }
    public static int removeDigitBeforeLastDigit(int num) {
        String digits = Integer.toString(num);
        String temp = digits.substring(0, digits.length()-2)+digits.charAt(digits.length()-1);
        return Integer.parseInt(temp);
    }
}
