package GFG;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DuplicateArray {
    public static void main(String[] args) {
        int [] arr = {2, 3, 1, 2, 3};
        ArrayList<Integer> ans = solve(arr);
        System.out.println(ans);
    }

    private static ArrayList<Integer> solve(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for(int i=0; i<arr.length; i++){
            if(map.get(arr[i])==2 && !ans.contains(arr[i])){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
