package LeetCodeContest;

public class LargestIntegerWithGivenDigitSum {
    public static void main(String[] args) {
        int n = 2;
        int s = 9;
        int ans = solve(n, s);
        System.out.println(ans);
    }

    private static int solve(int n, int s) {
        if(s==0) return 0;
        if(s>9*n) return -1;
        int ans = 0;
        int k = s;
        for(int i=0; i<n; i++){
            for(int j=9; j>=0; j--){
                if(j<=k){
                    ans = ans*10+j;
                    k-=j;
                    break;
                }
            }
        }
        return ans;
    }
}
