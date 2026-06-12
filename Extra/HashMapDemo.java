import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = {1, 1, 1, 1, 2, 2, 2, 1, 2, 1, 2, 3, 3, 2, 3, 3, 2, 1, 2, 3, 5};
        for(int e: arr){
            map.put(e, map.getOrDefault(e, 0)+1);
        }
        for (Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
        int out = 5;
        System.out.println("After removing.....");
        map.put(out, map.getOrDefault(out, 0) - 1);
        if (map.get(out) == 0) {
            map.remove(out);
        }
        for (Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
