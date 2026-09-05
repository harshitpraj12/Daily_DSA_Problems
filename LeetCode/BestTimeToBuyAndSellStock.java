package LeetCode;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        int ans = solve(arr);
        System.out.println(ans);
    }

    private static int solve(int[] arr) {
        int max = 0;
        int buy = arr[0];
        for(int i=1; i<arr.length; i++){
            if(buy<arr[i]){
                max+=(arr[i]-buy);
                buy=arr[i];
            }else{
                buy=arr[i];
            }
        }
        return max;
    }
}
