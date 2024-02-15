import java.util.Scanner;

public class PrintEvenIndices {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int [] store=new int[n];
        for (int i=0; i<store.length; i++)
        {
            store[i]=scanner.nextInt();
        }
        int a=0;
        printEvenIndices(store,0,n);
    }
    private static void printEvenIndices(int[] store, int i, int n) {
        if (i>=n)
        {
            return;
        }
        if (i%2==0)
        {
            printEvenIndices(store,i+2,n);
            System.out.print(store[i] + " ");
        }else
        {
            printEvenIndices(store,i+2,n);
        }
    }

//    private static void printEvenIndices(int[] store,int a) {
//        if (a==store.length)
//        {
//            return;
//        }
//        System.out.print(store[a] + " ");
//        printEvenIndices(store,a + 2);
//    }
}

