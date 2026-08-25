package striverDsaSheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumToTarget {
    public static void main(String[] args) {
        int [] arr = {1000000000,1000000000,1000000000,1000000000};
        int tar = -294967296;
        List<List<Integer>> list = solve(arr, tar);
        System.out.println(list);
    }

    private static List<List<Integer>> solve(int[] arr, int tar) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0; i<n-3; i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int a = arr[i];
            long req = tar-a;
            System.out.println(req);
            for(int j=i+1; j<n-2; j++){
                if(j>i+1 && arr[j]==arr[j-1]) continue;
                int left = j+1;
                int right = n-1;
                while(left<right){
                    long sum = (long)arr[j]+arr[left]+arr[right];
                    if(sum==req){
                        ans.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));
                        while(left<right && arr[left]==arr[left+1]) left++;
                        while(left<right && arr[right]==arr[right-1]) right--;
                        left++;
                        right--;
                    }else if(sum<req){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return ans;
    }
}
