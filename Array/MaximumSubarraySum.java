package Array;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int [] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;
        
        // Brute force Approach

        int sum = 0;
        for(int i=0; i<n; i++){
            int helper = 0;
            for(int j=i; j<n; j++){
                helper+=arr[j];
                sum = Math.max(helper, sum);
            }
        }
        System.out.println("Maximum sum is: "+ sum);

        // Optimal Approch (Kadane's Algorithm)

        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = -1;
        int end = -1;
        for(int i=0; i<n; i++){
            if(currentSum==0) start=i;
            currentSum+=arr[i];
            if(currentSum>max){
                max=currentSum;
                end = i;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }
        System.out.println("Sum is from index: "+ start+" to "+ end);
        for(int i=start; i<=end; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Maximum sum: "+ max);
    }
}
