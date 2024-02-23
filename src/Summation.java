import java.util.Scanner;

public class Summation {
    static long sum=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int [] store=new int[number];
        for (int i=0;i<number;i++)
        {
            store[i]=scanner.nextInt();
        }
        summation(store,0);
        System.out.println(sum);
    }

    private static long summation(int[] store, int i) {
        if(i==store.length)
        {
            return sum;
        }
        sum+=store[i];
        return summation(store,i+1);
    }
}
