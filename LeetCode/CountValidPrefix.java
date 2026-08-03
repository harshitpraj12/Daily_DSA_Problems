package LeetCode;

public class CountValidPrefix {
    public static void main(String[] args) {
        String s = "000101";
        int one = 0;
        int zero = 0;
        int valid = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0') zero++;
            else one++;
            if(Math.abs(zero-one)<=1) valid++;
        }
        System.out.println(valid);
    }
}
