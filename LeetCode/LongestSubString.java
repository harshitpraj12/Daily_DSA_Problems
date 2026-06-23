package LeetCode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "aab";
        int ans = solve(str);
        System.out.println(ans);
    }

    private static int solve(String str) {
        // Queue<Character>queue = new LinkedList<>();
        // int ans = 0;
        // for(char ch: str.toCharArray()){
        //     if(queue.contains(ch)){
        //         queue.poll();
        //         if(!queue.contains(ch)){
        //             queue.offer(ch);
        //         }
        //         continue;
        //     }
        //     queue.offer(ch);
        //     ans = Math.max(ans, queue.size());
        // }
        Set<Character> set = new HashSet<>();
        int ans = 0;
        int left = 0;

        for (int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);
            while (set.contains(ch)) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(ch);
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
