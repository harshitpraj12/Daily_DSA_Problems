package LeetCode;

import java.util.ArrayList;

public class SuperPalindrom {
    public static void main(String[] args) {
        String a = "4";
        String b = "10000000";
        ArrayList<Long> ans = solve(a, b);
        System.out.println(ans);
    }

    private static ArrayList<Long> solve(String a, String b) {
        long left = Long.parseLong(a);
        long right = Long.parseLong(b);
        int count = 0;
        ArrayList<Long> ans = new ArrayList<>();

        for(int i=1; i<100000; i++){
            StringBuilder sb = new StringBuilder(Integer.toString(i));
            for(int j = sb.length()-2; j>=0; j--){
                sb.append(sb.charAt(j));
            }
            long num = Long.parseLong(sb.toString());
            long sqr = num * num;
            if(sqr>right) break;
            if(sqr>=left && isPalindrom(sqr)){
                count++;
                ans.add(sqr);
            }
        }
        for(int i=1; i<100000; i++){
            StringBuilder sb = new StringBuilder(Integer.toString(i));
            for(int j = sb.length()-1; j>=0; j--){
                sb.append(sb.charAt(j));
            }
            long num = Long.parseLong(sb.toString());
            long sqr = num * num;
            if(sqr>right) break;
            if(sqr>=left && isPalindrom(sqr)){
                count++;
                ans.add(sqr);
            }
        }
        System.out.println("Total Super Palindrom "+ count);
        return ans;
    }

    private static boolean isPalindrom(long sqr) {
        long original = sqr;
        long reverse = 0;
        while(sqr>0){
            reverse = reverse * 10 + (sqr%10);
            sqr/=10;
        }
        return original==reverse;
    }
}
