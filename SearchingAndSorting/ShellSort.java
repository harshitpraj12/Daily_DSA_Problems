package SearchingAndSorting;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int arr [] = {34, 2, 54, 2, 6, 8, 56, 3, 32, 76, 4321, 82};

        int n = arr.length;

        for(int gap = n/2; gap>0; gap/=2){
            for(int i = gap; i<n; i++){
                int temp = arr[i];
                int j = i;
                while(j>=gap && arr[j-gap]>temp){
                    arr[j] = arr[j-gap];
                    j = j-gap;
                }
                arr[j] = temp;
            }
        }

        System.out.println("Sorted Array is : "+ Arrays.toString(arr));
    }
}
