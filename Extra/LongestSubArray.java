public class LongestSubArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        int windoeSum =0;
        for(int i=0; i<k; i++){
            windoeSum+=arr[i];
        }
        int sum = windoeSum;

        for(int i = k; i<arr.length; i++){
            windoeSum += (arr[i]-arr[i-k]);
            sum = Math.max(sum, windoeSum);
        }
        System.out.println("Max sum is : "+ sum);
    }
}
