package DivideAndConquer;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {-23, 34, 65, 2, 8, -2, 64, 87, 21, 45};
        int l = 0;
        int r = arr.length-1;
        
        quickSort(arr, l, r);

        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int l, int r) {
        if(l<r){
            int pivot = partition(arr, l, r);

            quickSort(arr, l, pivot-1);
            quickSort(arr, pivot+1, r);
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // choosing the last element as pivot
        int i = low - 1;        // pointer for smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {  // if current element < pivot
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
