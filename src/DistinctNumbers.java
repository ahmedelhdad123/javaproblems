import java.util.HashSet;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int [] arr=new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=scanner.nextInt();
        }
        distinctNumbers(arr);
    }

    private static void distinctNumbers(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for (int j : arr) {
            set.add(j);
        }
        System.out.println(set.size());
    }
}
