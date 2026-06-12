package GFG;

import java.util.ArrayList;
import java.util.HashMap;

public class DistinctElementInSubArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 4, 2, 3, 3, 4, 5, 6, 4};
        int k = 4;
        ArrayList<Integer> a = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<k; i++){
            int m = arr[i];
            map.put(m, map.getOrDefault(m, 0)+1);
        }
        a.add(map.size());
        for(int i=k; i<arr.length; i++){
            int out = arr[i-k];
            map.put(out, map.getOrDefault(out, 0)-1);
            if(map.get(out)==0){
                map.remove(out);
            }
            int ele = arr[i];
            map.put(ele, map.getOrDefault(ele, 0)+1);
            a.add(map.size());
        }
        for(int e: a){
            System.out.print(e+" ");
        }
    }
}
