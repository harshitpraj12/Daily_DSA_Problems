package GFG;

import java.util.ArrayList;

public class NumberWithIncreasingDigit {
    public static void main(String[] args) {
        int n = 2;
        ArrayList<Integer> ans = solve(n);
        System.out.println(ans);
    }

    private static ArrayList<Integer> solve(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(n>9){
            return ans;
        }
        if(n==1){
            for(int i=0; i<=9; i++){
                ans.add(i);
            }
            return ans;
        }
        for(int i=1; i<=9; i++){
            buildNumber(i, i, 1, n, ans);
        }
        return ans;
    }

    private static void buildNumber(
        int currentNum, int lastDigit, int currentLength, int n, ArrayList<Integer> result
    ) {
        if(currentLength==n){
            result.add(currentNum);
            return;
        }
        for (int i = lastDigit + 1; i <= 9; i++) {
            buildNumber(currentNum * 10 + i, i, currentLength + 1, n, result);
        }
    }
}
