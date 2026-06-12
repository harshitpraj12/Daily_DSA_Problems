package Array;


public class LongestSubarrayOfSumK {
    public static void main(String[] args) {
        // int [] arr = {1, 2, 1, 1, 1, 1, 1, 4, 2, 3};
        int arr [] ={19, 13, 14, 15, 15};
        int k = 12;
        // Brute Force Approach
        int len = 0;
        for(int i=0; i<arr.length; i++){
            int sum = arr[i];
            int val = 1;
            if(sum>k){
                break;
            }
            for(int j=i+1; j<arr.length; j++){
                sum+=arr[j];
                if(sum<=k){
                    val++;
                }else if(sum>k){
                    break;
                }
            }
            len = Math.max(val, len);
        }
        System.out.println("Length is : " + len);
    }
}
