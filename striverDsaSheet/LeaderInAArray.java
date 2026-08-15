package striverDsaSheet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderInAArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 5, 3, 1, 2};
        List<Integer> ans = solve(arr);
        System.out.println(ans);
    }

    private static List<Integer> solve(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int max = arr[n-1];
        ans.add(max);
        for(int i=n-2; i>=0; i--){
            if(arr[i]>max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
