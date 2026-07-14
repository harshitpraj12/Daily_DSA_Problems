package LeetCode;

public class StringToInteger {
    public static void main(String[] args) {
        String str = "-91283472332";
        int ans = solve(str);
        System.out.println(ans);
        System.out.println(Integer.MIN_VALUE);
    }

    private static int solve(String str) {
        int n = str.length();
        int i=0;
        while(i<n && str.charAt(i)==' '){
            i++;
        }
        int sign = 1;
        if(i<n && (str.charAt(i)=='+' || str.charAt(i)=='-')){
            if(str.charAt(i)=='-'){
                sign=-1;
            }
            i++;
        }
        int result = 0;
        while(i<n && Character.isDigit(str.charAt(i))){
            int digit = str.charAt(i++)-'0';
            if(result > Integer.MAX_VALUE / 10 || 
               (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)){
                return sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result=result*10+digit;
        }
        return sign*result;
    }
}
