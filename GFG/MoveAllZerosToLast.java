package GFG;

public class MoveAllZerosToLast {
    public static void main(String[] args) {
        int [] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        solve(arr);
        move(arr);
        backMove(arr);
        for(int a: arr){
            System.out.print(a+" ");
        }
    }

    private static void backMove(int[] arr) {
        int r = arr.length-1;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[r];
                arr[r] = temp;
                r--;
            }
        }
    }

    private static void move(int[] arr) {
        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    private static void solve(int[] arr) {
        int n = arr.length;
        int zero = 0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                arr[zero++] = arr[i];
            }
        }
        int a = zero;
        for(int i=a; i<n; i++){
            arr[a++] = 0;
        }

    }
}
