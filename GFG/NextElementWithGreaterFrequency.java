package GFG;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class NextElementWithGreaterFrequency {
    public static void main(String[] args) {
        int [] arr = {2, 6, 4, 2, 2, 10, 7, 5};
        ArrayList<Integer> a = nextFreElement(arr);
        System.out.println(a);
    }

    private static ArrayList<Integer> nextFreElement(int[] arr) {
        ArrayList<Integer> a = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int e:arr){
            map.put(e, map.getOrDefault(e, 0)+1);
        }
        for(int i=0; i<arr.length-1; i++){
            boolean found = false;
            for(int j = i+1; j<arr.length; j++){
                if(map.get(arr[j])>map.get(arr[i])){
                    a.add(arr[j]);
                    found = true;
                    break;
                }
            }
            if(!found){
                a.add(-1);
            }
        }
        a.add(-1);
        return a;
    }
}
