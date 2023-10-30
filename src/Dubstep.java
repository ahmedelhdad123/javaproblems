
//problem Link https://codeforces.com/contest/208/problem/A

import java.util.Scanner;
public class Dubstep {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String store=scanner.next();
        String lastStore=store.replaceAll("WUB"," ");
        System.out.println(lastStore);
    }
}
