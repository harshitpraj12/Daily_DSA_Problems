package GFG;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
    }

    private static int maxSubarraySum(int[] arr) {
        int maxEnd = arr[0];
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            maxEnd = Math.max(maxEnd+arr[0], arr[0]);
            max = Math.max(max, maxEnd);
        }
        return max;
    }
}
