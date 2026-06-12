package SearchingAndSorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr [] = {34, 12, 64, 7, 4, 32, 65, 82, 43, 54};
        System.out.println("Unsorted Array is: "+ Arrays.toString(arr));

        int n = arr.length;
        iSort(arr, 0, n-1);
        System.out.println("Sorted Array is: "+Arrays.toString(arr));
    }

    // Insertion Sort — “Insert like arranging playing cards.”

    // Keyword: I → Insert
    // Take one element and insert it into the correct place in the sorted left part.
    
    private static void iSort(int[] arr, int l, int n) {
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1]=key;
        }
    }
}
