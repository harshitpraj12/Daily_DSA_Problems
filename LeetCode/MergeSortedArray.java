package LeetCode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        solve(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    private static void solve(int[] nums1, int m, int[] nums2, int n) {
        int last = m+n-1;
        int x = m-1;
        int y = n-1;
        while(x>=0 && y>=0){
            if(nums1[x]>=nums2[y]){
                nums1[last--] = nums1[x--];
            }else{
                nums1[last--] = nums2[y--];
            }
        }
        while(x>=0) nums1[last--] = nums1[x--];
        while(y>=0) nums1[last--] = nums1[y--];
    }
}
