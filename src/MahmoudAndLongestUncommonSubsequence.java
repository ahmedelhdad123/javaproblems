
import java.util.Scanner;


public class MahmoudAndLongestUncommonSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a=scanner.nextLine();
        String b=scanner.nextLine();
        if(a.equals(b))
        {
            System.out.println("-1");
        } else if (a.length()<b.length()) {
            System.out.println(b.length());
        }else
        {
            System.out.println(a.length());
        }
    }
}
