package DynamicProgramming;

public class Fibo {
    public static void main(String[] args) {
        int n = 6;
        int ans = solve(n);
        System.out.println(ans);
    }

    private static int solve(int n) {
        int [] ans = new int[n+1];
        for(int i=0; i<ans.length; i++){
            ans[i]=-1;
        }
        return solved(n, ans);
    }

    private static int solved(int n, int[] ans) {
        if(n==1 || n==0){
            ans[n]=n;
            return n;
        }            
        if(ans[n]!=-1){
            return ans[n];
        }
        int a = solved(n-1, ans)+solved(n-2, ans);
        ans[n] = a;
        return a;
    }
}
