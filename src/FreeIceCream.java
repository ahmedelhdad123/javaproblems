
/*
   Problem Link
   https://codeforces.com/contest/686/problem/A
 */
import java.util.Scanner;

public class FreeIceCream {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long numberOfCharacter=scanner.nextLong();
        long numberOfPack=scanner.nextLong();
        int countOfMiss= 0;
        for (int i=0;i<numberOfCharacter;i++)
        {
            char operation=scanner.next().charAt(0);
            int number=scanner.nextInt();
            if (operation=='+')
            {
                numberOfPack+=number;
            }else
            {
                if (numberOfPack<number)
                {
                    countOfMiss++;
                }else
                {
                    numberOfPack-=number;
                }
            }
        }
        System.out.println(numberOfPack + " " + countOfMiss);
    }
}
