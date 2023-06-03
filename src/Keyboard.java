import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        String store="qwertyuiopasdfghjkl;zxcvbnm,./";
        char []x=store.toCharArray();
        String a = scanner.next();
        char []b=a.toCharArray();
        String res="";
        if(c=='R')
        {
            for (int i=0;i<b.length;i++)//s;;upimrrfod;pbr
            {
                for (int j=0;j<x.length;j++)//qwertyuiopasdfghjkl;zxcvbnm,./
                {
                    if (b[i]==x[j])
                    {
                        res+=x[j-1];
                    }
                }
            }
        }else
        {
            for (int i=0;i<b.length;i++)//s;;upimrrfod;pbr
            {
                for (int j=0;j<x.length;j++)
                {
                    if (b[i]==x[j])
                    {
                        res += x[j+1];
                    }
                }
            }
        }
        System.out.println(res);
    }
}
/*
String value="qwertyuiopasdfghjkl;zxcvbnm,./"
char c = scanner.next().charAt(0);
String input=scanner.next();
for (int i=0;i<input.length();i++)
    {
        int index=value.indexOf(input.charAt(i);
        if(c=='L')
        {
           System.out.print(value.charAt(index+1));
        }else
        {
          System.out.print(value.charAt(index-1));
        }
    }
 */