package GFG;

public class CutRopeToMaximizeTheProduxt {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(solve(n));

    }

    private static int solve(int n) {
        if(n==2) return 1;
        if(n==3) return 2;

        int ans = 1;
        while(n>3){
            ans*=3;
            n-=3;
        }
        return ans*n;
    }
}