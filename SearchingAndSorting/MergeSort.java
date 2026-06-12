package SearchingAndSorting;

public class MergeSort {
    public static void main(String[] args) {
        int arr [] = {34, 12, 64, 7, 4, 32, 65, 82, 43, 54};
        System.out.printf("Unsorted Array is: ");
        print(arr);
        int n = arr.length;
        mSort(arr, 0, n-1);
        System.out.print("Sorted Array is: ");
        print(arr);
    }

    public static void print(int[] arr) {
        for(int n : arr){
            System.out.print(n+" ");
        }
        System.out.println();
    }

    private static void mSort(int[] arr, int i, int n) {
        if(i<n){
            int mid= i + (n-i)/2;
            mSort(arr, i, mid);
            mSort(arr, mid+1, n);
            merge(arr, i, mid, n);
        }
    }

    private static void merge(int[] arr, int i, int mid, int n) {
        int n1 = mid-i+1;
        int n2 = n-mid;
        int arr1 []= new int[n1];
        int arr2 [] = new int [n2];
        for(int j=0; j<n1; j++) arr1[j]=arr[i+j];
        for(int j=0; j<n2; j++) arr2[j]=arr[mid+j+1];
        
        int j=0, k=0, l=i;

        while(j<n1 && k<n2){
            if(arr1[j]<arr2[k]){
                arr[l++]=arr1[j++];
            }else{
                arr[l++]=arr2[k++];
            }
        }

        while (j<n1) {
            arr[l++]=arr1[j++];
        }

        while(k<n2){
            arr[l++]=arr2[k++];
        }
    }
}
