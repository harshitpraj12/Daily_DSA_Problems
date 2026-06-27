package GFG;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,8,9,10,11,12,13};
        // int [] arr1 = {4, 5, 6, 7, 1, 2, 3};
        int [] arr1 = {3, 1};
        int target = 1;
        // System.out.println(solve(arr, target));
        System.out.println(solved(arr1, target));
        // if(solve(arr1, target)){
        //     System.out.println("TRUE");
        // }else{
        //     System.out.println("FALSE");
        // }
    }

    private static int solved(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]>=arr[lo]){
                if(target>=arr[lo] && target<arr[mid]){
                    hi = mid-1;
                }else{
                    lo = mid+1;
                }
            }else{
                if(target>arr[mid] && target<=arr[hi]){
                    lo = mid+1;
                }else{
                    hi = mid-1;
                }
            }
        }
        return -1;
    }

    private static int solve(int[] arr, int tar) {
        int left = 0;
        int right = arr.length-1; 
        while(left<right){
            int mid = left+(right-left)/2;
            if(arr[mid]==tar) return mid;
            if(arr[mid]>tar) right = mid-1;
            else left = mid+1;
        }
        return -1;
    }
}
