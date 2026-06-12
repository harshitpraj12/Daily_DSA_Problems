package GFG;

public class TrappingRainWater {
    public static void main(String[] args) {
        int [] arr = {3, 0, 1, 0, 4, 0, 2};
        int ans = solve(arr);
        System.out.println("Total water is : "+ ans);
    }

    private static int solve(int[] arr) {
        int n = arr.length;
        // int [] min = arr.clone();
        // int [] max = arr.clone();

        // // 3, 0, 1, 0, 4, 0, 2
        // for(int i=0; i<n-1; i++){
        //     if(min[i]>min[i+1]){
        //         min[i+1] = min[i];
        //     }
        // }
        // for(int i=n-1; i>0; i--){
        //     if(max[i]>max[i-1]){
        //         max[i-1] = max[i];
        //     }
        // }

        // int ans = 0;
        // for(int i=1; i<n-1; i++){
        //     ans+=Math.min(min[i], max[i])-arr[i];
        // }
        // TC- O(n) SC - O(n)
        int ans = 0;
        int left = 0;
        for(int i=0; i<n; i++){
            if(arr[i]>left) left = arr[i];
            int right = 0;
            for(int j=i; j<n; j++){
                if(arr[j]>right) right = arr[j];
            }
            ans+=Math.min(left, right) - arr[i];
        }
        return ans;

        // Optimized Solution
        // int left = 1;
        // int right = n-2;

        // int lmax = arr[left-1];
        // int rmax = arr[right+1];

        // int res = 0;
        // while(left<=right){
        //     if(rmax<=lmax){
        //         res+=Math.min(rmax, lmax) - arr[right];
        //         rmax = Math.max(rmax, right);
        //         right--;
        //     }else{
        //         res+=Math.min(rmax, lmax) - arr[left];
        //         lmax = Math.max(rmax, left);
        //         left++;
        //     }
        // }
        // return res;
    }
}
