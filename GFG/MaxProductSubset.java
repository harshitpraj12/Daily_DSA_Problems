package GFG;

public class MaxProductSubset {
    public static void main(String[] args) {
        int [] arr = {-1, 0, -2, 4, 3};
        int a = solve(arr);
        System.out.println("Answer is : "+ a);
    }

    private static int solve(int[] arr) {
        int n = arr.length;
        if(n==1){
            return arr[0];
        }
        long product =1;
        int maxNegative = Integer.MIN_VALUE;
        int countNegative = 0;
        int countZero = 0;
        boolean hasPositive = false;
        for(int i = 0; i<n; i++){
            if(arr[i]==0){
                countZero++;
                continue;
            }
            if(arr[i]<0){
                countNegative++;
                maxNegative = Math.max(maxNegative, arr[i]);
            }else{
                hasPositive = true;
            }
            product*=arr[i];
        }
        if(countZero==n){
            return 0;
        }
        if(countNegative%2!=0){
            if (countNegative == 1 && !hasPositive && countZero > 0) {
                return 0;
            }
            product/=maxNegative;
        }
        return (int)product;
    }
}
