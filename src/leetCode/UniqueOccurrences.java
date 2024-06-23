package leetCode;
/*
    Problem Link In LeetCode
    https://leetcode.com/problems/unique-number-of-occurrences/submissions/1272443250/?envType=study-plan-v2&envId=leetcode-75
 */
import java.util.*;

public class UniqueOccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size=in.nextInt();
        int [] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i]=in.nextInt();
        }
        Map<Integer,Integer> occurrences = new HashMap<>();
        for (int i=0; i< arr.length; i++){
            int count=0;
            for (int j=0; j< arr.length; j++){
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            occurrences.put(arr[i],count);
        }
        Set<Integer> check=new HashSet<>(occurrences.values());

        if (check.size()==occurrences.size()){
            System.out.println("true");
        }else
        {
            System.out.println("false");
        }
    }
}
