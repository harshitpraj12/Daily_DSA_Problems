package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum2 {
    public static void main(String[] args) {
        int [] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = solve(arr);
        System.out.println(list);
    }

    private static List<List<Integer>> solve(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        int n = arr.length;
        // for(int i=0; i<n; i++){
        //     int a = arr[i];
        //     int val = 0-a;
        //     System.out.println(val);
        //     HashMap<Integer, Integer> map = new HashMap<>();
        //     for(int j=i+1; j<n; j++){
        //         int k = arr[j];
        //         int req = val-k;
        //         if(map.containsKey(req)){
        //             list.add(List.of(a, req, k));
        //         }
        //         map.put(k, j);    
        //     }
        // }
        // return list;
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            int a = arr[i];
            if (arr[i] > 0) {
                break;
            }
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = a + arr[left] + arr[right];
                if(sum==0){
                    list.add(List.of(a, arr[left], arr[right]));
                    left++;
                    right--;
                    while(left<right && arr[left]==arr[left-1]){
                        left++;
                    }
                    while(right>left && arr[right]==arr[right+1]){
                        right--;
                    }
                }else if(sum>0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return list;
    }
}
