package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class RestoreFinishOrder {
    public static void main(String[] args) {
        int [] a = {3,1,2,5,4};
        int [] b = {1,3,4};
        int [] ans = solve(a, b);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] solve(int[] a, int[] b) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<a.length; i++){
        //     map.put(a[i], i);
        // }
        // System.out.println(map);
        // int [] ans = new int[b.length];
        // for(int i=0; i<b.length; i++){
            //     ans[i] = map.get(b[i]);
            // }
            // return ans;
            
            int [] ans = new int[b.length];
            int idx=0;
            for(int i=0; i<a.length; i++){
                for(int j=0; j<b.length; j++){
                    if(a[i]==b[j]){
                        ans[idx++]=a[i];
                    }
                }
            }
            return ans;
    }
}
