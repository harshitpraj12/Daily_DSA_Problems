package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {3, 5,1, 7, 8};
        int target = 13;
        int [] a = solve(arr, target);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }

    private static int[] solve(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int c = target-arr[i];
            if(map.containsKey(c)){
                return new int[] {map.get(c), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }
}
