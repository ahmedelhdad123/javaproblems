
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=1;i<=x;i++)
        {
            int z=scanner.nextInt();
            map.put(z,i);
        }
        for (int i=1;i<=x;i++)
        {
            System.out.println(map.get(i));
        }
    }
}