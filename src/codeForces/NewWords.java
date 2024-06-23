package codeForces;

import java.util.Scanner;

public class NewWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.next().toLowerCase();
        int countE=0;
        int countG=0;
        int countY=0;
        int countP=0;
        int countT=0;
        for (int i=0;i<input.length();i++)
        {
            if (input.charAt(i)=='e')
            {
                countE++;
            } else if (input.charAt(i)=='g') {
                countG++;
            } else if (input.charAt(i)=='y') {
                countY++;
            } else if (input.charAt(i)=='p') {
                countP++;
            } else if (input.charAt(i)=='t') {
                countT++;
            }
        }
        int min=Math.min(countE,Math.min(countG,Math.min(countY,Math.min(countP,countT))));
        System.out.println(min);

    }
}
