import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String store=scanner.nextLine().toLowerCase();
        int count=countVowels(store,0);
        System.out.println(count);
    }

    private static int countVowels(String store, int i) {
        if (i==store.length())
        {
            return 0;
        }
        char character=store.charAt(i);
        if (character=='a'||character=='e'||character=='i'||character=='o'||character=='u')
        {
            return 1+countVowels(store,i+1);
        }else
        {
            return countVowels(store,i+1);
        }
    }
}
