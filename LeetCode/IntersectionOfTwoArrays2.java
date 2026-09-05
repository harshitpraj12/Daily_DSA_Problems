package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class IntersectionOfTwoArrays2 {
    public static void main(String[] args) {
        int [] a = {9,4,5};
        int [] b = {9,4,9,8,4};
        int [] ans = solve(a, b);
        System.out.println(Arrays.toString(ans));
        int [] k = {1,2,2,1};
        int [] l = {2,2};
        int [] an = solve(k, l);
        System.out.println(Arrays.toString(an));
    }

    private static int[] solve(int[] a, int[] b) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for(int n : a){
            map1.put(n, map1.getOrDefault(n, 0)+1);
        }
        int [] ans = new int[Math.max(a.length, b.length)];
        int idx = 0;
        for(int i=0; i<b.length; i++){
            if(map1.containsKey(b[i])){
                ans[idx++]=b[i];
                if(map1.get(b[i])==1) map1.remove(b[i]);
                else map1.put(b[i], map1.getOrDefault(b[i], 0)-1);
            }
        }
        return Arrays.copyOfRange(ans, 0, idx);
    }
}
