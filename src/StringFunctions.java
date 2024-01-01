import java.util.*;


public class StringFunctions {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        String s = in.next();

        ArrayList<Character> string = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            string.add(s.charAt(i));
        }
        for (int i = 0; i < x; i++) {
            String qu = in.next();
            if (qu.equals("substr")) {
                int L = in.nextInt();
                int R = in.nextInt();
                int l=Math.min(L, R);
                int r=Math.max(L, R);
                for (int j = l - 1; j < r; j++) {

                    System.out.print(string.get(j));
                }
                System.out.println("");

            } else if (qu.equals("sort")) {

                int L = in.nextInt();
                int R = in.nextInt();
                int l=Math.min(L, R);
                int r=Math.max(L, R);
                char temp = ' ';

                for (int k = l - 1; k < r; k++) {

                    for (int h = k + 1; h < r; h++) {

                        if (string.get(h) < string.get(k)) {
                            temp = string.get(h);
                            string.set(h, string.get(k));
                            string.set(k, temp);
                        }
                    }
                }

            } else if (qu.equals("pop_back")) {
                for (int k = 0; k < string.size(); k++) {
                    if (k == string.size() - 1) {
                        string.remove(k);
                    }
                }
            } else if (qu.equals("back")) {
                System.out.println(string.get(string.size() - 1));
            } else if (qu.equals("reverse")) {
                int L = in.nextInt();
                int R = in.nextInt();
                int l=Math.min(L, R);
                int r=Math.max(L, R);
                char[] str = new char[string.size()];
                for (int k = 0; k < string.size(); k++) {
                    str[k] = string.get(k);
                }
                int p = 1;
                for (int k = 0; k < string.size(); k++) {
                    if (k >= l - 1 && k < r) {
                        string.set(k, str[r - p]);
                        p++;
                    }

                }

            } else if (qu.equals("front")) {
                System.out.println(string.get(0));
            } else if (qu.equals("push_back")) {
                char c = in.next().charAt(0);
                string.add(c);
            } else if (qu.equals("print")) {
                int p = in.nextInt();
                System.out.println(string.get(p-1));
            }
        }

    }

}