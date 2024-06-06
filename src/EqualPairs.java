
/*
  problem Link in leetcode
  https://leetcode.com/problems/equal-row-and-column-pairs/submissions/1279862352/?envType=study-plan-v2&envId=leetcode-75
 */
import java.util.*;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] grid = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        HashMap<List<Integer>, Integer> mp = new HashMap<>();
        int n=grid.length;
        for (int[] ints : grid) {
            List<Integer> li = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                li.add(ints[j]);
            }
            mp.put(li, mp.getOrDefault(li, 0) + 1);
        }
        int count=0;
        for(int i=0;i<n;i++){
            List<Integer> li=new ArrayList<>();
            for (int[] ints : grid) {
                li.add(ints[i]);
            }
            if (mp.containsKey(li)){
                count+=mp.get(li);
            }
        }
        System.out.println(count);

    }
}
/*
 HashSet<List<Integer>> uniqueRows = new HashSet<>();
        for (int i = 0; i < rows; i++) {
            List<Integer> rowList = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                rowList.add(grid[i][j]);
            }
            uniqueRows.add(rowList);
        }
        HashSet<List<Integer>> uniqueCols = new HashSet<>();
        for (int j = 0; j < cols; j++) {
            List<Integer> colList = new ArrayList<>();
            for (int i = 0; i < rows; i++) {
                colList.add(grid[i][j]);
            }
            uniqueCols.add(colList);
        }

        HashSet<List<Integer>> uniqueList = new HashSet<>();
        uniqueList.addAll(uniqueRows);
        uniqueList.addAll(uniqueCols);
        System.out.println(uniqueRows);
        System.out.println(uniqueCols);
        System.out.println(uniqueList);
        int result=(uniqueRows.size()+uniqueCols.size())-uniqueList.size();
        System.out.println(result);
 */
