
/*
    Problem Link
    https://codeforces.com/group/MWSDmqGsZm/contest/219856/problem/Y
 */
import java.util.Scanner;

public class MinCostString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int[] costs = new int[26];

        for (int i = 0; i < 26; i++) {
            costs[i] = sc.nextInt();
        }

        int size = s.length();
        int counter;
        StringBuilder result = new StringBuilder(s);

        for (int i = 0; i < size; i++) {
            counter = 0;
            if (s.charAt(i) == '?') {
                for (int z = i; z < size; z++) {
                    if (s.charAt(z) == '?') {
                        counter++;
                    } else {
                        break;
                    }
                }
                if (counter == size) {
                    System.out.println("0");
                    result.setLength(0); // Clear the StringBuilder
                    result.append("a".repeat(size));
                    System.out.println(result);
                    return;
                } else {
                    if (i == 0) {
                        int ma = Integer.MAX_VALUE, index = -1;
                        for (int z = 0; z < s.charAt(counter) - 'a' + 1; z++) {
                            int myCost = Math.abs(costs[s.charAt(counter) - 'a'] - costs[z]);
                            if (myCost < ma) {
                                ma = myCost;
                                index = z;
                            }
                        }
                        char c = (char) ('a' + index);
                        for (int z = 0; z < counter; z++) {
                            result.setCharAt(z, c);
                        }
                        i += counter;
                    } else if (i + counter == size) {
                        int ma = Integer.MAX_VALUE, index = -1;
                        for (int z = 0; z < s.charAt(i - 1) - 'a' + 1; z++) {
                            int myCost = Math.abs(costs[s.charAt(i - 1) - 'a'] - costs[z]);
                            if (myCost < ma) {
                                ma = myCost;
                                index = z;
                            }
                        }
                        char c = (char) ('a' + index);
                        for (int z = i; z < counter + i; z++) {
                            result.setCharAt(z, c);
                        }
                        break;
                    } else {
                        int ma = Integer.MAX_VALUE, index = -1;
                        for (int z = 0; z < 26; z++) {
                            int myCost = Math.abs(costs[s.charAt(i - 1) - 'a'] - costs[z]) +
                                    Math.abs(costs[z] - costs[s.charAt(i + counter) - 'a']);
                            if (myCost < ma) {
                                ma = myCost;
                                index = z;
                            }
                        }
                        char c = (char) ('a' + index);
                        for (int z = i; z < i + counter; z++) {
                            result.setCharAt(z, c);
                        }
                        i += counter;
                    }
                }
            }
        }

        long finalCost = 0;

        for (int i = 0; i < size - 1; i++) {
            finalCost += Math.abs(costs[result.charAt(i) - 'a'] - costs[result.charAt(i + 1) - 'a']);
        }

        System.out.println(finalCost);
        System.out.println(result);

        sc.close();

    }
}
