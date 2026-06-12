package SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int arr [] = {34, 12, 64, 7, 4, 32, 65, 82, 43, 54};
        Arrays.sort(arr);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int ele = sc.nextInt();
        System.out.println("Sorted arrays is: "+Arrays.toString(arr));
        int n = arr.length;
        int index = bSearch(arr, 0, n-1, ele);
        if(index == -1){
            System.out.println("Element not found in the array.");
        }
        // print(arr);
        sc.close();
    }

    // private static void print(int[] arr) {
    //     for(int a : arr){
    //         System.out.print(a+" ");
    //     }
    // }

    private static int bSearch(int[] arr, int l, int n, int ele) {
        if(l>n){
            return -1;
        }
        int mid = (l+n)/2;
        if(arr[mid]==ele){
            System.out.println("Element is at index "+ mid);
            return mid;
        }
        if(ele<arr[mid]){
            return bSearch(arr, l, mid-1, ele);
        }else{
            return bSearch(arr, mid+1, n, ele);
        }
    }
}
