public class FactorialDemo {
    public static int n = 0;
    public static void main(String[] args) {
        n = 5;
        int ans = fact(n);
        n = 6;
        int ans2 = fact(n);
        System.out.println(ans2);
        System.out.println(ans);
    }

    private static int fact(int n) {
        if(n<=1) return 1;
        return n * fact(n-1);
    }
}
