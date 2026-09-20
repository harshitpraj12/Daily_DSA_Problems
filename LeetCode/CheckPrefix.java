package LeetCode;

public class CheckPrefix {
    public static void main(String[] args) {
        String s = "iloveleetcode";
        String [] words = {"i","love","leetcode","apples"};
        if(solve(s,words)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    private static boolean solve(String s, String[] words) {
        // if(s.isEmpty()) return true;
        // StringBuilder sb = new StringBuilder();
        // for(String ss : words){
        //     for(char a : ss.toCharArray()){
        //         sb.append(a);
        //     }
        // }
        // String t = sb.toString();
        // return t.startsWith(s);
        String t = "";
        for(String ss : words){
            t+=ss;
            if(t.equals(s)) return true;
        }
        return false;
    }
}
