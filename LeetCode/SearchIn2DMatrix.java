package LeetCode;

import java.util.Arrays;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int [][] arr = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23,30,34,60}};
        int target = 3;
        int [] ar = solve(arr, target);
        System.out.println(Arrays.toString(ar));
        
    }

    private static int [] solve(int[][] arr, int target) {
        int [] ar = new int[2];
        int m = arr.length;
        int n = arr[0].length;
        int te = m*n;
        int left = 0;
        int right = te-1;
        while (left<=right) {
            int mid = left+(right-left)/2;
            System.out.println("mid : "+ mid);
            int first = mid/n;
            int second = mid%n;
            System.out.print("Index "+first+" "+ second);
            System.out.println("  Element: "+arr[first][second]);
            if(arr[first][second]==target){
                ar[0]=first;
                ar[1]=second;
                return ar;
            }
            else if(arr[first][second]>target) right=mid-1;
            else left = mid+1;
        }
        return null;
    }
}
