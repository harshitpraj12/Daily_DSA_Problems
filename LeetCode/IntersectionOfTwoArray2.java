package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

import org.w3c.dom.Entity;

public class IntersectionOfTwoArray2 {
    public static void main(String[] args) {
        int [] a = {4, 9, 5};
        int [] b = {9, 4, 9, 8, 4};
        int [] ans = solve(a, b);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] solve(int[] a, int[] b) {
        // -- Method 1
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i=0; i<a.length; i++){
        //     int aa = a[i];
        //     for(int j=0; j<b.length; j++){
        //         if(b[j]==-1) continue;
        //         if(b[j]==aa){
        //             list.add(aa);
        //             b[j]=-1;
        //             a[i]=-1;
        //             break;
        //         }
        //     }
        // }
        // int [] ans = new int[list.size()];
        // int i=0;
        // for(int n: list){
        //     ans[i++]=n;
        // }
        // return ans;

        // -- Method 2
        // int [] count = new int[1001];
        // for(int n : a){
        //     count[n]++;
        // }
        // int [] helper = new int[Math.min(a.length, b.length)];
        // int idx = 0;
        // for(int n : b){
        //     if(count[n]>0){
        //         helper[idx++]=n;
        //         count[n]--;
        //     }
        // }
        // return Arrays.copyOfRange(helper, 0, idx);

        // -- Method 3

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : a){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : b){
            if(map.getOrDefault(n, 0)>0){
                list.add(n);
                map.put(n, map.get(n)-1);
            }
        }
        int [] ans = new int[list.size()];
        int idx = 0;
        for(int n : list){
            ans[idx++]=n;
        }
        return ans;

    }
}
