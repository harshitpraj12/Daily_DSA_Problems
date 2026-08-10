package striverDsaSheet;

import java.util.Arrays;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int [] a = {1, 3, 5, 7, 9};
        int [] b = {2, 4, 6, 8, 10};
        int [] ans = solve(a, b);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] solve(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int [] ans = new int[n+m];
        int i=0, j=0, k=0;
        while(i<n && j<m){
            if(a[i]>b[j]){
                ans[k++]=b[j++];
            }else{
                ans[k++]=a[i++];
            }
        }
        while(i<n){
            ans[k++]=a[i++];
        }
        while(j<m){
            ans[k++]=b[j++];
        }
        return ans;
    }
}
