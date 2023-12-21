
/*
     Problem Link
     https://codeforces.com/group/MWSDmqGsZm/contest/219432/problem/Y
 */
import java.util.ArrayList;
import java.util.Scanner;

public class EasyFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int next = 1, prev = 0, sum;

        for (int i = 0; i < num; i++) {

            System.out.print(prev + " ");

            sum = next + prev;

            prev = next;

            next = sum;

        }
    }
}
/*
int size=scanner.nextInt();
        int result=0;
        ArrayList<Integer> store=new ArrayList<>();
        store.add(0);
        store.add(1);
        if (size==1)
        {
            System.out.println(0);
        }else
        {
            for (int i=0;i<45;i++){
                result=store.get(i)+store.get(i+1);
                store.add(result);
                if (store.size()==size)
                {
                    break;
                }
            }
            for (int i = 0; i < store.size(); i++) {
                System.out.print(store.get(i));
                if (i < store.size() - 1) {
                    System.out.print(" ");
                }
            }
        }
 */
