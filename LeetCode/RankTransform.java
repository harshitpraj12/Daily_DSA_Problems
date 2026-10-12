package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RankTransform {
    public static void main(String[] args) {
        int [] arr = {37,12,28,9,100,56,80,5,12};
        int [] ans = solve(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] solve(int[] arr) {
        int [] ans = arr.clone();
        Arrays.sort(arr);
        HashMap<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for(int a : arr){
            if(map.containsKey(a)){
                continue;
            }else{
                map.put(a, idx++);
            }
        }
        for(int i=0; i<arr.length; i++){
            ans[i] = map.get(ans[i]);
        }
        return ans;
    }
}
