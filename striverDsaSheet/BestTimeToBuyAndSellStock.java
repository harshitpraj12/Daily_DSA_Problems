package striverDsaSheet;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        int ans = solve(arr);
        System.out.println(ans);
    }

    private static int solve(int[] arr) {
        int max = 0;
        int a = arr[0];
        int b = 0;
        for(int i=1; i<arr.length; i++){
            b = arr[i];
            if((b-a)<=0) a = arr[i];
            if((b-a)>max) max = b-a;
        }
        return max;
    }
}
