package LeetCode;

public class MInimalSizeSubarray {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        long tar = 7;
        int ans = solve(arr, tar);
        System.out.println(ans);
    }

    private static int solve(int[] arr, long tar) {
        // int left = 0;
        // int min = Integer.MAX_VALUE;
        int n = arr.length;
        // int right = 0;
        // int sum = 0;
        // while(right<n){
        //     sum+=arr[right];
        //     while(left<n && left<=right && sum>=tar){
        //         min=Math.min(min, right-left+1);
        //         sum-=arr[left];
        //         left++;
        //     }
        //     right++;
        // }
        // return min;
        long [] maxarr = new long[n];
        maxarr[0]=arr[0];
        for(int i=1; i<n; i++){
            maxarr[i]=maxarr[i-1]+arr[i];
        }
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            long needed = maxarr[i] + tar;
            // Find smallest index j such that prefixSums[j] >= needed
            int j = binarySearch(maxarr, needed);

            if (j <= n) {
                min = Math.min(min, j - i);
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
    private static  int binarySearch(long[] prefixSums, long target) {
        int low = 0;
        int high = prefixSums.length;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (prefixSums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
