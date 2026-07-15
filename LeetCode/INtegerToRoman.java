package LeetCode;

public class INtegerToRoman {
    public static void main(String[] args) {
        int num = 1994;
        String ans = solve(num);
        System.out.println(ans);
    }

    private static String solve(int num) {
        int [] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String [] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(num>0){
            if(value[i]<=num){
                sb.append(symbol[i]);
                num-=value[i];
            }else{
                i++;
            }
        }
        return sb.toString();
    }
}
