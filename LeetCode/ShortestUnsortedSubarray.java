package LeetCode;

public class ShortestUnsortedSubarray {
    public static void main(String[] args) {
        int [] nums = {1, 1, 4, 4, 3, 3, 2, 2, 2, 2, 6};
        int ans = solve(nums);
        System.out.println(ans);
    }

    private static int solve(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[n-1];

        int right = -1;
        int left = -1;
        for(int i=0; i<n; i++){
            if(nums[i]<max) right=i;
            else max = nums[i];
        }
        for(int i=n-1; i>=0; i--){
            if(nums[i]>min) left = i;
            else min = nums[i];
        }
        return right==-1?0:right-left+1;
    }
}
