package LeetCode;

public class NumberOfEvenDigitInArray {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        int ans = solve(nums);
        System.out.println(ans);
    }

    private static int solve(int[] nums) {
        int ans = 0;
        for(int n : nums){
            int count = 0;
            while(n!=0){
                n/=10;
                count++;
            }
            if(count%2==0) ans++;
        }
        return ans;
    }
}
