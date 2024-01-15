import java.util.ArrayList;
import java.util.Scanner;

public class ShiftZeros {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int [] arr=new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=scanner.nextInt();
        }
        shiftZeros(arr);
    }

    private static void shiftZeros(int[] arr) {
        ArrayList<Integer> store=new ArrayList<>();
        for (int i=0;i< arr.length;i++)
        {
            if (arr[i]!=0)
            {
                store.add(arr[i]);
            }
        }
        for (int i=store.size();i< arr.length;i++)
        {
            store.add(0);
        }
        for (Integer value:store)
        {
            System.out.print(value + " ");
        }

    }
}
