import java.util.Scanner;

public class LoveStory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String store="codeforces";
        long n=scanner.nextInt();
        long count=0;

        for (int i=0;i<n;i++)
        {
            String s=scanner.next();
            for (int j=0;j<store.length();j++)
            {
                if(store.charAt(j)!=s.charAt(j))
                {
                    count++;
                }
            }
            System.out.println(count);
            count=0;
        }
    }
}
