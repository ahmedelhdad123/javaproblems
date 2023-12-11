import java.util.Scanner;

public class CaisaAndPylons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = 0, dollars = 0, n;
        n = scanner.nextInt();
        int[] h = new int[n];

        for (int i = 0; i < n; i++)
            h[i] = scanner.nextInt();

        dollars = h[0];

        for (int i = 0; i < n - 1; i++) {
            if (h[i] >= h[i + 1])
                energy += h[i] - h[i + 1];
            else {
                int energy1 = h[i + 1] - h[i];
                if (energy >= energy1)
                    energy -= energy1;
                else {
                    dollars += energy1 - energy;
                    energy = 0;
                }
            }
        }

        System.out.println(dollars);
    }
}
