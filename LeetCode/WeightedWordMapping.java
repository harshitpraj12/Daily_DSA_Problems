package LeetCode;

import java.util.HashMap;

public class WeightedWordMapping {
    public static void main(String[] args) {
        String [] s = {"abcd","def","xyz"};
        int [] w = {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
        System.out.println(solve(s, w));
    }

    private static String solve(String[] s, int[] w) {
        HashMap<Integer, Character> map = new HashMap<>();
        for(int i=0; i<26; i++){
            char c = (char) ('z' - i);
            map.put(i, c);
        }
        StringBuilder ansStr = new StringBuilder();
        for(String str : s){
            int sum = 0;
            for(char ch : str.toCharArray()){
                sum+=w[ch-'a'];
            }
            sum%=26;
            ansStr.append(map.get(sum));
        }
        return ansStr.toString();
    }
}
