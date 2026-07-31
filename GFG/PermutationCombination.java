package GFG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationCombination {
    public static void main(String[] args) {
        String s = "abc";
        List<String> answer = permutaion(s);
        System.out.println(answer);
    }

    private static List<String> permutaion(String s) {
        List<String> ans = new ArrayList<>();
        solve(s, "", ans);
        Collections.sort(ans);
        return ans;
    }

    private static void solve(String in, String ou, List<String> ans) {
        if(in.isEmpty()) ans.add(ou);
        for(int i=0; i<in.length(); i++){
            char ch = in.charAt(i);
            String rem = in.substring(0, i) + in.substring(i+1);
            solve(rem, ou+ch, ans);
        }
    }
}
