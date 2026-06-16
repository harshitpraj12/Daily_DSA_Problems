package GFG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class ConstructListUsingXOR {
    public static void main(String[] args) {
        int [][] queries = {{0, 2}, {1, 3}, {0, 5}};
        ArrayList<Integer> arr = solve(queries);
        System.out.println(arr);
    }

    private static ArrayList<Integer> solve(int[][] queries) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        // for(int [] querie : queries){
        //     if(querie[0]==0){
        //         ans.add(querie[1]);
        //     }else{
        //         for(int i = 0; i<ans.size(); i++){
        //             ans.set(i, ans.get(i)^querie[1]);
        //         }
        //     }
        // }
        
        //  OR

        int xor = 0;
        for(int [] querie : queries){
            if(querie[0]==0){
                ans.add(querie[1]^xor);
            }else if(querie[0]==1){
                xor ^= querie[1];
            }
        }
        for(int i=0; i<ans.size(); i++){
            ans.set(i, ans.get(i)^xor);
        }
        Collections.sort(ans);
        return ans;
    }
    
}
