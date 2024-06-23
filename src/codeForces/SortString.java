package codeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        String input = scanner.next();
        char [] store=input.toCharArray();
        int[] count = new int[26];
        for (int i = 0; i < size; i++) {
            count[store[i] - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                System.out.print((char) (i + 'a'));
                count[i]--;
            }
        }

    }
}
/*
 ArrayList<Character> store = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            store.add(input.charAt(i));
        }
        char temp = ' ';
        for (int i=0;i<input.length();i++)
        {
            for (int k=i+1;k<size;k++)
            {
                if (store.get(k) < store.get(i)) {
                    temp = store.get(k);
                    store.set(k, store.get(i));
                    store.set(i, temp);
                }
            }
        }
        for (char character : store) {
            System.out.print(character);
        }
 */
/*
 char[] charArray = input.toCharArray();

        char temp = ' ';
        for (int i = 0; i < input.length(); i++) {
            for (int k = i + 1; k < size; k++) {
                if (charArray[k] < charArray[i]) {
                    temp = charArray[k];
                    charArray[k] = charArray[i];
                    charArray[i] = temp;
                }
            }
        }
        String sortedString = new String(charArray);
        System.out.println(sortedString);
 */
/*
int[] count = new int[256]; // Assuming ASCII character set

        for (int i = 0; i < size; i++) {
            count[input.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            while (count[i] > 0) {
                System.out.print((char) i);
                count[i]--;
            }
        }
 */