package LeetCode;

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr = {3,0,1,2,5,6};
        System.out.println(solve(arr));
    }

    private static int solve(int[] nums) {
        if(nums.length==1){
            if(nums[0]==1) return 0;
            else return 1;
        }
        int n = nums.length;
        int sum = 0;
        boolean zero = false;
        for(int i=0; i<n; i++){
            sum+=nums[i];
            if(nums[i]==0) zero=true;
        }
        if(!zero) return 0;
        int total = (n*(n+1))/2;
        if(sum!=total) return total-sum;
        return n;
    }
}
