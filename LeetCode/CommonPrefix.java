package LeetCode;

import java.util.Arrays;

public class CommonPrefix {
    public static void main(String[] args) {
        int [] a = {1, 5, 4, 2, 3};
        int [] b = {3, 2, 1, 4, 5};
        int [] ans = solve(a, b);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] solve(int[] a, int[] b) {
        int n = a.length;
        int [] ans = new int[n];
        int [] freq = new int[n+1];
        int count = 0;
        for(int i=0; i<n; i++){
            freq[a[i]]++;
            if(freq[a[i]]==2){
                count++;
            }
            freq[b[i]]++;
            if(freq[b[i]]==2){
                count++;
            }
            ans[i]=count;
        }
        return ans;
    }
}
