package GFG;

public class TotalSum {
    public static void main(String[] args) {
        int [] arr = {1, 1, 1, 1, 1};
        int target = 3;
        int ans = solve(arr, target);
        System.out.println("Answer is : "+ ans);
    }

    private static int solve(int[] arr, int target) {
        int sum = 0;
        for(int a : arr){
            sum+=a;
        }
        int total = sum+target;
        if(total%2!=0){
            return 0;
        }
        int tar = total/2;
        if(tar<0){
            return 0;
        }
        int [] dp = new int[tar+1];
        dp[0] = 1;
        for(int num : arr){
            for(int s = tar; s>=num; s--){
                dp[s]+=dp[s-num];
            }
        }
        return dp[tar];
    }
}
