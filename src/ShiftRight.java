import java.util.ArrayList;
import java.util.Scanner;

public class ShiftRight {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        ArrayList<Integer> store=new ArrayList<>();
        int shift=scanner.nextInt();
        for (int i=0;i<size;i++)
        {
            store.add(scanner.nextInt());
        }
        doShift(store,shift,size);
    }

    private static void doShift(ArrayList<Integer> store,int shift,int size) {
        for (int i=0;i<shift;i++)
        {
            Integer temp = store.get(size - 1);
            store.remove(size - 1);
            store.add(0, temp);
        }
        for (Integer value : store) {
            System.out.print(value + " ");
        }
    }


}
