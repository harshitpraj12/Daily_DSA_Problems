package GFG;

public class FlipForMaxOneSubArray {
    public static void main(String[] args) {
        int [] arr = {1, 0, 0, 1, 0, 0, 1};
        System.out.println(solve(arr));
    }

    private static int solve(int[] arr) {
        int one = 0;
        for(int x : arr){
            if(x==0) one++;
        }
        int max = 0;
        int curr = 0;
        for(int x : arr){
            if(x==0) curr++;
            else curr--;
            if(curr<0) curr=0;
            if(curr>max) max = curr;
        }
        return one+max;
    }
}
