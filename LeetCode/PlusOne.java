package LeetCode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int [] arr = {4,3,2,1};
        int [] ar = {9};
        int [] ans1 = solve(arr);
        int [] ans2 = solve(ar);
        System.out.println(Arrays.toString(ans1));
        System.out.println(Arrays.toString(ans2));
    }

    private static int[] solve(int[] arr) {
        int n = arr.length;
        for(int i=n-1; i>=0; i--){
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        int [] result = new int[n+1];
        result[0]=1;
        return result;
    }
}
