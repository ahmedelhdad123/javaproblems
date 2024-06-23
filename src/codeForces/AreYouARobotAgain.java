package codeForces;

import java.util.Scanner;

public class AreYouARobotAgain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String temp1=scanner.nextLine();
        String temp2=scanner.nextLine();
        int count=0,x=0;
        if (temp1.contains(temp2))
        {
            for (int i=0;i<temp1.length();i++)
            {
                if (temp1.charAt(i)==temp2.charAt(count))
                {
                   count++;
                   if (count==temp2.length())
                   {
                       x=i-count+1;
                       break;
                   }
                }else
                {
                    count=0;
                }
            }
            System.out.println(x+ " " + count);
        }else
        {
            System.out.println(-1);
        }
    }
}
