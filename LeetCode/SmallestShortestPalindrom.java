package LeetCode;

import java.util.Arrays;

public class SmallestShortestPalindrom {
    public static void main(String[] args) {
        String s = "daccad";
        // char [] left = s.substring(0, s.length()/2).toCharArray();
        // Arrays.sort(left);
        // System.out.println(left);

        // StringBuilder le = new StringBuilder();
        // for(char a : left){
        //     le.append(a);
        // }
        StringBuilder right = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            right.append(s.charAt(i));
        }
        String r = right.toString().repeat(4);
        System.out.println(r);
        // String l = le.toString();
        // System.out.println(l+r);
        String ans = solve(s);
        System.out.println(ans);
    }

    private static String solve(String s) {
        char [] left = s.substring(0, s.length()/2).toCharArray();
        Arrays.sort(left);
        StringBuilder l = new StringBuilder();
        StringBuilder r = new StringBuilder();
        for(char a : left){
            l.append(a);
            r.append(a);
        }
        String le = l.toString();
        String re = r.reverse().toString();
        if(s.length()%2!=0){
            return le+s.charAt(s.length()/2)+re;
        }
        return le+re;
    }
}
