package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalesTriangle {
    public static void main(String[] args) {
        int n = 4;
        List<Integer> ans = solve(n);
        System.out.println(ans);
    }

    private static List<Integer> solve(int n) {
        List<Integer> pre = new ArrayList<>();
        pre.add(1);
        for(int i=1; i<=n; i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j=1; j<i; j++){
                curr.add(pre.get(j-1)+pre.get(j));
            }
            curr.add(1);
            pre = curr;
        } 
        return  pre;
    }
}
