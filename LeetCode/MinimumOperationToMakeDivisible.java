package LeetCode;

import java.util.Arrays;

public class MinimumOperationToMakeDivisible {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 6};
        int sum = Arrays.stream(nums).reduce(0, (a, b)-> a+b);
        System.out.println(sum);
        System.out.println(sum%5);
    }
}
