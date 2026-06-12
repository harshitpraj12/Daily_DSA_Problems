package GFG;

public class ImplementAtio {
    public static void main(String[] args) {
        String str1 = "   -999999999999";
        String str2 = "  -0012gfg4";
        int ans1 = solve(str1);
        int ans2 = solve(str2);
        System.out.println(ans1+" "+ ans2);
    }

    private static int solve(String str) {
        if(str==null || str.isEmpty()) return 0;
        int i = 0;
        int n = str.length();
        while(i<n && str.charAt(i)==' '){
            i++;
        }
        if(i==n) return 0;

        int sign = 1;
        if(str.charAt(i)=='+'||str.charAt(i)=='-'){
            sign = (str.charAt(i)=='-')?-1:1;
            i++;
        }
        long result = 0;
        while (i<n && Character.isDigit(str.charAt(i))) {
            int digit = str.charAt(i)-'0';
            result = result*10 +digit;
            
            if(sign==1 && result>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign==-1 && -result<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) (sign*result);
        
    }
}
