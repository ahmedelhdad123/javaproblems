
/*
   Problem Link
   https://codeforces.com/contest/785/problem/A
 */
import java.util.HashMap;
import java.util.Scanner;

public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPolyhedrons = scanner.nextInt();
        HashMap<String, Integer> store = new HashMap<>();
        store.put("Tetrahedron", 4);
        store.put("Cube", 6);
        store.put("Octahedron", 8);
        store.put("Dodecahedron", 12);
        store.put("Icosahedron", 20);
        int sum = 0;

        for (int i = 0; i < numberOfPolyhedrons; i++) {
            String polyhedron = scanner.next();
            sum += store.get(polyhedron);
        }

        System.out.println(sum);
    }
}
