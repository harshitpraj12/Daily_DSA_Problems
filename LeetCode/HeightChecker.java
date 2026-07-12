package LeetCode;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int [] height = {3, 4, 5, 1, 2, 2};
        int [] clone = height.clone();
        Arrays.sort(clone);
        int count = 0;
        for(int i = 0; i<height.length; i++){
            if(height[i]!=clone[i]) count++;
        }
        System.out.println(count);
    }
}
