package LeetCode;

import java.util.HashSet;

public class SmallestSequentialPrefixSum {
    public static void main(String[] args) {
        // int [] arr = {1, 2, 3, 2, 5};
        int [] arr = {3,4,5,1,12,14,13};
        int ans = solve(arr);
        System.out.println(ans);
    }

    private static int solve(int[] arr) {
        int n = arr.length;
        int sum = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]==arr[i-1]+1){
                sum+=arr[i];
            }else{
                break;
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int k : arr){
            set.add(k);
        }
        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
}
