package GFG;

public class ConsecutiveOneNotAllowed {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Answer is : "+ solve(n));
    }

    private static int solve(int n) {
        int pone = 1;
        int pzero = 1;
        for(int i=2; i<=n; i++){
            int zero = pzero+pone;
            int one = pzero;
            pzero = zero;
            pone = one;
        }
        return pone+pzero;
    }
}
