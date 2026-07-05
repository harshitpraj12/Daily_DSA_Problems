package LeetCode;

public class MaximumSum {
    public static void main(String[] args) {
        int [] arr = {-2,4,-5,4,-5,9,4};
        System.out.println(solve(arr));
    }

    private static int solve(int[] arr) {
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for(int a : arr){
            curr = Math.max(curr+a, a);
            max = Math.max(max, curr);
        }
        return max;
    }
}
