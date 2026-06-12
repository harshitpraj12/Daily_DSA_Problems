package GFG;

public class ConsecutiveNumberSum {
    public static void main(String[] args) {
        int n = 8;
        if(solve(n)) System.out.println("True");
        else System.out.println("False");
    }

    private static boolean solve(int n) {
        return n>0 && (n&(n-1))!=0;
    }
}
