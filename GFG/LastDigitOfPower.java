package GFG;

public class LastDigitOfPower {
    public static void main(String[] args) {
        // String a = "1810673";
        // String b = "112356991086";
        String a = "3";
        String b = "10";

        System.out.println(solve(a, b));
    }

    private static int solve(String a, String b) {
        if(b.equals("0")) return 1;
        int base = a.charAt(a.length()-1)-'0';
        if(base==0) return 0;
        int exp = 0;
        for(int i=0; i<b.length(); i++){
            exp = (exp*10+(b.charAt(i)-'0'))%4;
        }
        if(exp==0) exp=4;
        int result = (int) Math.pow(base, exp);
        return result%10;
    }
}
