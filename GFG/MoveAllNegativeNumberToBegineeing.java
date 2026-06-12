package GFG;

public class MoveAllNegativeNumberToBegineeing {
    public static void main(String[] args) {
        int [] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int n = arr.length;

// Brute force approach

        // for(int k=0; k<arr.length; k++){
        //     if(arr[k]<0) continue;
        //     for(int l = k; l<n; l++){
        //         if(arr[l]<0){
        //             int temp = arr[k];
        //             arr[k] = arr[l];
        //             arr[l] = temp;
        //             break;
        //         }
        //     }
        // }

// Two pinter approach

        // int j = 0;
        // for(int i=0; i<n; i++){
        //     if(arr[i]<0){
        //         int temp = arr[i];
        //         arr[i] = arr[j];
        //         arr[j] = temp;
        //         j++;
        //     }
        // }

// Two pointer appoach

        int left = 0;
        int right = n-1;
        while(left<right){
            while(left<right && arr[left]<0){
                left++;
            }
            while(right>left && arr[right]>0){
                right--;
            }
            if(right>left){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
