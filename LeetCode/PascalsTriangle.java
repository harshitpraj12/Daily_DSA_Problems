package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 6;
        List<List<Integer>> ans = solve(n);
        System.out.println(ans);
    }

    private static List<List<Integer>> solve(int n) {
        List<List<Integer>> result = new ArrayList<>();
        // int k = 11;
        // result.add(Arrays.asList(1));
        // for(int i=1; i<n; i++){
        //     List<Integer> ans = new ArrayList<>();
        //     int num = Math.powExact(k, i);
        //     while(num!=0){
        //         int a = num%10;
        //         num /= 10;
        //         ans.add(a);
        //     }
        //     Collections.reverse(ans);
        //     result.add(ans);
        // }
        // return result;
        if(n==0) return result;

        result.add(List.of(1));
        for(int i=1; i<n; i++){
            List<Integer> row = new ArrayList<>();
            List<Integer> preRow = result.get(i-1);
            row.add(1);
            for(int j=1; j<i; j++){
                row.add(preRow.get(j-1)+preRow.get(j));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}
