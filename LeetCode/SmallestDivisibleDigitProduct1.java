package LeetCode;

public class SmallestDivisibleDigitProduct1 {
    public static void main(String[] args) {
        int n = 1;
        int t = 6;
        int ans = solve(n, t);
        System.out.println(ans);
    }

    private static int solve(int n, int t) {
        int a = n;
        int pro = 1;
        while(a!=0){
            int k = a%10;
            pro*=k;
            a/=10;
        }
        System.out.println(pro);
        if(pro%t==0) return n;
        while(pro%t!=0){
            a=++n;
            pro = 1;
        while(a!=0){
            int k = a%10;
            pro*=k;
            a/=10;
        }
        }
        return n;
    }
}
