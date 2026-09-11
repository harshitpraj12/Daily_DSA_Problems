package LeetCode;

public class LargestIntegerTwiseOfNum {
    public static void main(String[] args) {
        int [] arr = {3,6,1,0};
        int ans = solve(arr);
        System.out.println(ans);
    }

    private static int solve(int[] arr) {
        int max = -1;
        int smax = -1;
        int idx = -1;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
                idx = i;
            }else if(arr[i]>smax){
                smax = arr[i];
            }
        }
        return max==smax*2?idx:-1;
    }
}
