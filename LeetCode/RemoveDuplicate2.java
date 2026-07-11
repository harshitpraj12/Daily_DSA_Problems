package LeetCode;

public class RemoveDuplicate2 {
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,1,2,3,3};
        int n = solve(nums);
        for(int i=0; i<n; i++){
            System.out.print(nums[i]+" ");
        }
    }

    private static int solve(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        // int k = 1;
        // int i = 1;

        // while(i<nums.length){
        //     if(nums[i]==nums[i-1]){
        //         nums[k++]=nums[i];
        //         while(i<nums.length-1 && nums[i+1]==nums[i]){
        //             i++;
        //         }
        //     }else{
        //         nums[k++]=nums[i];
        //     }
        //     i++;
        // }
        int k = 2;
        for(int i=2; i<nums.length; i++){
            if(nums[i]!=nums[i-2]){
                nums[k++]=nums[i];
            }
        }
        return k;
    }
}
