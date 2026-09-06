package LeetCode;

public class SmallestStableElement {
    public static void main(String[] args) {
        int [] arr = {5,0,1,4};
        int k = 3;
        int ans = solve(arr, k);
        System.out.println(ans);
    }

    private static int solve(int[] arr, int k) {
        int n = arr.length;
        int [] min = new int[n];
        min[n-1]=arr[n-1];
        for(int i=n-2; i>=0; i--){
            min[i]=Math.min(min[i+1], arr[i]);
        }
        int max = arr[0];
        for(int i=0; i<n; i++){
            max = Math.max(max, arr[i]);
            long a = (long) max-min[i];
            if(a<=k){
                return i;
            }
        }
        return -1;
    }
}
