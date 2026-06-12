package SearchingAndSorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr [] = {34, 12, 64, 7, 4, 32, 65, 82, 43, 54};
        int n = arr.length-1;
        System.out.println("unsorted array is " + Arrays.toString(arr));
        qSort(arr, 0, n);
        System.out.println("Sorted array is " + Arrays.toString(arr));
    }

    private static void qSort(int[] arr, int i, int n) {
        if(i<n){
            int pi = partition(arr, i, n);

            qSort(arr, i, pi-1);
            qSort(arr, pi+1, n);
        }

    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = low-1;

        for(int j = low; j<=high-1; j++){
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
