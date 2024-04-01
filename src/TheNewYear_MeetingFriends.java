
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TheNewYear_MeetingFriends {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int z=scanner.nextInt();
        ArrayList<Integer> store=new ArrayList<>();
        store.add(x);
        store.add(y);
        store.add(z);
        Collections.sort(store);
        int sum;
        sum=(store.get(2)-store.get(1))+(store.get(1)-store.get(0));
        System.out.println(sum);
    }
}
