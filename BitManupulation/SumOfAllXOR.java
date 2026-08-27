package BitManupulation;

public class SumOfAllXOR {
    public static void main(String[] args) {
        int [] arr = {5,1,6};
        int ans = solve(arr);
        System.out.println(ans);
    }

    private static int solve(int[] arr) {
        int count = 0;
        for(int n : arr) count|=n;
        return (count<<(arr.length-1));
    }
}
