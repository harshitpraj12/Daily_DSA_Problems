package GFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangleTwo {
    public static void main(String[] args) {
        int rowIndex = 1;
        ArrayList<Integer> arr = solve(rowIndex);
        System.out.println(arr);
        String [] a = {"das", "asda", "asdas"};
        System.out.println(Arrays.toString(a));
    }

    private static ArrayList<Integer> solve(int rowIndex) {
        ArrayList<Integer> arr = new ArrayList<>();
        if(rowIndex==0) return new ArrayList<>(List.of(1));
        if(rowIndex==1) return new ArrayList<>(List.of(1, 1));
        return new ArrayList<>();
    }
}
