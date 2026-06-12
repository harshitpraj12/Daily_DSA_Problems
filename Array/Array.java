package Array;

import java.util.HashMap;

public class Array {
    // In java in an empty array zero is by default stored in it
    public static void main(String[] args) {
        int [] arr = {2, 3, 2, 2, 2, 4, 3, 2};
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(arr[2], map.getOrDefault(arr[2], 0)+1);
        System.out.println(map);
    }
}
