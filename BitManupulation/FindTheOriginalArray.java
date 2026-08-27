package BitManupulation;

import java.util.Arrays;

public class FindTheOriginalArray {
    public static void main(String[] args) {
        int [] arr = {5, 2, 0, 3, 1};
        int [] ans = solve(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] solve(int[] arr) {
        int [] ans = new int[arr.length];
        int [] xarr = new int[arr.length];
        ans[0] = arr[0];
        int xor = ans[0];
        xarr[0] = xor;
        for(int i=1; i<arr.length; i++){
            int k = xarr[i-1]^arr[i];
            ans[i] = k;
            int l = xarr[i-1]^ans[i];
            xarr[i]=l;
        }
        return ans;
    }
}
