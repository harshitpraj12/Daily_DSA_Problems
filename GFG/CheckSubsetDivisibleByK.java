package GFG;

public class CheckSubsetDivisibleByK {
    public static void main(String[] args) {
        int [] arr = {3, 1, 7, 8};
        int k = 6;
        if(solve(arr, k)){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }

    private static boolean solve(int[] arr, int k) {
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                if(sum%k==0){
                    System.out.println(sum);
                    return true;
                }
            }
        }
        return false;
    }
}
