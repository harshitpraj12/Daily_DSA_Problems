package SearchingAndSorting;

import java.util.Arrays;

public class QuickSort1 {
    /*
        5️⃣ Quick Sort — “Pick pivot and partition around it.”
        Keyword: Q → Quick pivot pick
        Choose a pivot, put smaller on left, bigger on right → recursively repeat.
    */
    public static void main(String[] args) {
        int arr [] = {34, 12, 64, 7, 4, 32, 65, 82, 43, 54};
        System.out.println("Unsorted Array is: "+ Arrays.toString(arr));

        int n = arr.length;
        mSort(arr, 0, n-1);
        System.out.println("Sorted Array is: "+Arrays.toString(arr));

    }

    private static void mSort(int[] arr, int low, int high) {
        if(low<high){
            int pi = partition(arr, low, high);

            mSort(arr, low, pi-1);
            mSort(arr, pi+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = low-1;

        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
