import java.util.Scanner;

public class Knapsack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int items = scanner.nextInt();
        int W1 = scanner.nextInt();
        int[] weight = new int[items];
        int[] value = new int[items];

        for (int i = 0; i < items; i++) {
            weight[i] = scanner.nextInt();
            value[i] = scanner.nextInt();
        }

        System.out.println(knapSack(W1, weight, value, items));
    }

    public static int knapSack(int W, int[] weight, int[] value, int items) {
        if (W == 0 || items == 0) {
            return 0;
        }
        if (weight[items - 1] > W) {
            return knapSack(W, weight, value, items - 1);
        } else {
            return Math.max(
                    value[items - 1] + knapSack(W - weight[items - 1], weight, value, items - 1),
                    knapSack(W, weight, value, items - 1)
            );
        }
    }
}
