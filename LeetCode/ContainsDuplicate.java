package LeetCode;

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int [] arr = {6, 1, 2, 3, 5, 1};
        int [] num = {1, 3, 4, 5, 4, 5, 7};
        if(solve(arr)){
            System.out.println("Has Duplicate");
        }else{
            System.out.println("Has Unique");
        }
    }

    private static boolean solve(int[] arr) {
        return Arrays.stream(arr).distinct().count()!=arr.length;
    }
}
