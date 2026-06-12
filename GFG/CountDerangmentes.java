package GFG;

public class CountDerangmentes {
    public static void main(String[] args) {
        int n = 5;
        int arr [] = new int[n+1];
        System.out.println(solve(n, arr));
    }

    private static int solve(int n, int arr[]) {
        int a = 0; //1
        int b = 1; //2
        int ans = 0;
        for(int i=3; i<=n; i++){
            ans = ((i-1)*(b+a));
            a = b;
            b = ans;
        }
        return ans;
    }

}
