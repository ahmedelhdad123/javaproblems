
//  https://codeforces.com/group/MWSDmqGsZm/contest/223207/problem/C

package codeForces;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Dragons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n=in.nextInt();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<n;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            map.put(a, map.getOrDefault(a, 0) + b);
        }
        boolean check = true;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            int dragonStrength=entry.getKey();
            int dragonBonus=entry.getValue();
            if (s>dragonStrength) {
                s +=dragonBonus;
            }else {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
