package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,2,3};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : arr){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        List<Integer> list = new ArrayList<>();
        for(int n: arr){
            list.add(n);
        }
        Collections.sort(list, (a, b) -> {
            if (!map.get(a).equals(map.get(b))) return map.get(a) - map.get(b);
            return b-a;
        });
        System.out.println(list);
    }
}
