package DynamicProgramming;

public class TabularClimbingStairs {
    static int count;
    public static void main(String[] args) {
        int n = 40;
        int ans = solve(n);
        System.out.println("Answer is : "+ ans+" "+count);
    }
    private static int solve(int n) {
        int b = 1;
        int c = 2;
        for(int i=3; i<=n; i++){
            count++;
            int abc = b+c;
            b=c;
            c=abc;
        }
        return c;
    }
}
