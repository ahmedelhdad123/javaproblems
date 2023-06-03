import java.util.Scanner;

public class Presents {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int [] array=new int[x+1];
        for (int i=1;i<=x;i++)
        {
            int z=scanner.nextInt();
            array[z]=i;
        }
        for (int i=1;i<=x;i++)
        {
            System.out.println(array[i]);
        }
        /////////////////////////// A other solution //////////////////////////////////
        /*
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
         */
    }
}
