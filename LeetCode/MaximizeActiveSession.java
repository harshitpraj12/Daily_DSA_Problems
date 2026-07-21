package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class MaximizeActiveSession {
    public static void main(String[] args) {
        String s = "1000100";
        int ans = solve(s);
        System.out.println(ans);
    }

    private static int solve(String s) {
        int intialOnes = 0;
        for(char a : s.toCharArray()){
            if(a=='1') intialOnes++;
        }
        String t = "1"+s+"1";
        List<Integer> oneBlock = new ArrayList<>();
        List<Integer> zeroBlock = new ArrayList<>();
        int i = 0;
        int n = t.length();
        while(i<n){
            int one = 0;
            while(i<n && t.charAt(i)=='1'){
                one++;
                i++;
            }
            oneBlock.add(one);
            int zero = 0;
            while(i<n && t.charAt(i)=='0'){
                zero++;
                i++;
            }
            if(zero>0){
                zeroBlock.add(zero);
            }
        }
        if(oneBlock.size()<3){
            return intialOnes;
        }
        int maxGain = 0;
        for(int j=1; j<oneBlock.size()-1; j++){
            int currentGain = zeroBlock.get(j-1)+zeroBlock.get(j);
            maxGain = Math.max(maxGain, currentGain);
        }
        return intialOnes+maxGain;
    }
}
