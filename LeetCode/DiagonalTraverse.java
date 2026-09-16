package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DiagonalTraverse {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int [] ans = solve(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] solve(int[][] arr) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int n = arr.length;
        int [] ans = new int[n*n];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(map.containsKey(i+j)){
                    ArrayList<Integer> a = map.get(i+j);
                    a.add(arr[i][j]);
                    map.put(i+j, map.getOrDefault(i+j, a));
                }else{
                    map.put(i+j, new ArrayList<>(List.of(arr[i][j])));
                }
            }
        }
        System.out.println(map);
        int idx = 0;
        for(int i=0; i<map.size(); i++){
            ArrayList<Integer> list = map.get(i);
            if(i%2!=0){
                int k = list.size();
                for(int j=0; j<k; j++){
                    ans[idx]=list.get(j);
                    idx++;
                }
            }else{
                List<Integer> aa =list.reversed();
                int k = aa.size();
                for(int j=0; j<k; j++){
                    ans[idx]=aa.get(j);
                    idx++;
                }
            }
        }
        return ans;
    }
}
