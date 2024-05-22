import java.util.Scanner;

public class PivotIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int sumLeft = 0;
        for (int i = 0; i < nums.length; i++) {
            int sumRight = totalSum - sumLeft - nums[i];
            if (sumLeft == sumRight) {
                System.out.println(i);
                return;
            }
            sumLeft += nums[i];
        }

        System.out.println(-1);
    }
}
