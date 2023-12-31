import java.util.Scanner;

public class ILoveStrings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        while (size-->0)
        {
            String line1= scanner.next();
            String line2= scanner.next();
            StringBuilder store=new StringBuilder();
            int a=0;
            if (line1.length()>line2.length())
            {
                for (int i=0;i<line1.length();i++)
                {
                    if (a==line2.length())
                    {
                        store.append(line1.charAt(i));
                    }else
                    {
                        store.append(line1.charAt(i)).append(line2.charAt(a));
                        a++;
                    }
                }
                System.out.println(store);
            } else if (line1.length()<line2.length()) {
                for (int i=0;i<line2.length();i++)
                {
                    if (a==line1.length())
                    {
                        store.append(line2.charAt(i));
                    }else
                    {
                        store.append(line1.charAt(i)).append(line2.charAt(a));
                        a++;
                    }
                }
                System.out.println(store);
            }else
            {
                for (int i=0;i<line1.length();i++)
                {
                    store.append(line1.charAt(i)).append(line2.charAt(a));
                    a++;
                }
                System.out.println(store);
            }
        }
    }
}
