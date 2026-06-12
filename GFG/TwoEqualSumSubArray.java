package GFG;

public class TwoEqualSumSubArray {
    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 5, 5};
        if(canSplit(arr)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    private static boolean canSplit(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int x = arr[left];
        int y = arr[right];
        // 1, 2, 3, 4, 5, 5
        while(left+1<right){
            if(x<=y){
                left++;
                x+=arr[left];
                System.out.println("X "+x);
            }else{
                right--;
                y+=arr[right];
                System.out.println("Y "+y);
            }
        }
        if(x==y) return true;
        else return false;
    }
}
