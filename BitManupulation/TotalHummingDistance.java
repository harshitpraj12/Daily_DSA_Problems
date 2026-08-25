package BitManupulation;

public class TotalHummingDistance {
    public static void main(String[] args) {
        int [] arr = {6,1,8,6,8};
        int ans = solve(arr);
        System.out.println(ans);
    }

    private static int solve(int[] arr) {
        int ans = 0;
        int n = arr.length;
        for(int i=0; i<32; i++){
            int one = 0;
            for(int ar : arr){
                one+=(ar>>i)&1;
            }
            int zero = n-one;
            ans+=one*zero;
        }
        return ans;
    }
}
