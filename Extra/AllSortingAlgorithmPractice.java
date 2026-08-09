import java.util.Arrays;
import java.util.HashSet;

public class AllSortingAlgorithmPractice {
    public static void main(String[] args) {
        int [] arr = {5, 4, 8, 2, -9, 23, 8, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        int [] arr1 = {5, 4, 8, 2, -9, 23, 8, 1};
        bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));
        int [] arr2 = {-1, 1, 2, 2, -9, 23, 8, 1};
        insertionSort(arr2);
        System.out.println(Arrays.toString(arr2));
        int [] arr3 = {-1, 1, 2, 2, -9, 23, 8, 1};
        mergeSort(arr3, 0, arr3.length-1);
        System.out.println(Arrays.toString(arr3));

    }

    private static void mergeSort(int[] arr, int l, int r) {
        if(l<r){
        int mid = l+(r-l)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid-l+1;
        int n2 = r-mid;
        int [] L = new int[n1];
        int [] R = new int[n2];
        for(int i=0; i<n1; i++)
            L[i]=arr[l+i];
        for(int i=0; i<n2; i++)
            R[i]=arr[mid+1+i];

        int i=0, j=0, k=l;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k++]=L[i++];
            }else{
                arr[k++]=R[j++];
            }
        }
        while(i<n1){
            arr[k++]=L[i++];
        }
        while(j<n2){
            arr[k++]=R[j++];
        }
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped = false;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
                if(swapped==false) break;
            }
        }
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minIdx = i;
            for(int j = i+1; j<n; j++){
                if(arr[j]<arr[minIdx]) minIdx = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
}
