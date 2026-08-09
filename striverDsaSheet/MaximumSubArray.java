package striverDsaSheet;

public class MaximumSubArray {
    public static void main(String[] args) {
        int [] arr = {1};
        int ans = solve(arr);
        System.out.println(ans);
    }

    private static int solve(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(max<sum) max = sum;
            if(sum<0) sum=0;
        }
        return max;
    }
}
