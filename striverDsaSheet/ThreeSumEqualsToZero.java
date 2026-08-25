package striverDsaSheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumEqualsToZero {
    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = solve(nums);
        for(List<Integer> a : ans){
            System.out.println(a.get(0)+", " +a.get(1)+",  " +a.get(2));
        }
    }

    private static List<List<Integer>> solve(int[] nums) {
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        bubbleSort(nums);
        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left<right && nums[left]==nums[left+1]) left++;
                    while(left<right && nums[right]==nums[right-1]) right--;
                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return list;
    }

    private static void bubbleSort(int[] nums) {
        int n = nums.length;
        boolean sor = false;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1]=temp;
                    sor = true;
                }
            }
            if(!sor) break;
        }
    }
}
