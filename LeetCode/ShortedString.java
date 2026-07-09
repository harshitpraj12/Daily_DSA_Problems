package LeetCode;

import java.util.HashMap;
import java.util.Map.Entry;

public class ShortedString {
    public static void main(String[] args) {
        char [] str = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int ans = solve(str);
        System.out.println(ans);
        for(int i=0; i<ans; i++){
            System.out.print(str[i]+" ");
        }
    }

    private static int solve(char[] str) {
        int count = 0;
        char ch = ' ';
        StringBuilder st = new StringBuilder();
        int i=0;
        while(i<str.length){
            ch = str[i];
            int freq = 1;
            int idx = i+1;
            while(idx<str.length && str[idx]==ch){
                idx++;
                freq++;
            }
            if(freq==1){
                st.append(ch);
            }else{
                st.append(ch);
                st.append(freq);
            }
            i=idx;
        }
        String s = st.toString();
        count=s.length();
        int idx=0;
        for(char c : s.toCharArray()){
            str[idx++]=c;
        }
        return count;
    }
}
