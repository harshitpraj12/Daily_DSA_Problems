package Array;

public class MaximumSumOfSubArray {
    public static void main(String[] args) {
        int [] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        // Optimal Solution using Kadanes Algorithm

        int max = Integer.MIN_VALUE;
        int sum = 0;
        // start and end variables are used here to store the index of the subarray;
        int start = -1;
        int end = -1;
        for(int i=0; i<arr.length; i++){
            if(sum==0) start = i;
            sum+=arr[i];
            if(sum>max){
                max = sum;
                end = i;
            }
            if(sum<0) sum = 0;
        }

        System.out.println("Max element is : "+ max);
        for(int i=start; i<=end; i++){
            System.out.print(arr[i]+", ");
        }
    }
}
