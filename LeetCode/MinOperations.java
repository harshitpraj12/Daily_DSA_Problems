package LeetCode;

import java.util.Arrays;

public class MinOperations {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.stream(nums).filter(a->a%3!=0).count());
    }
}
