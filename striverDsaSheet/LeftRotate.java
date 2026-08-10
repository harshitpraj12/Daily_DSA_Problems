package striverDsaSheet;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 4, 5, 6,7,8};
        int k = 3;
        LeftRotate(arr1, k);
        System.out.println(Arrays.toString(arr1));
        int [] arr2 = {1, 2, 3, 4, 5, 6,7,8};
        int l = 3;
        rightRotate(arr2, l);
        System.out.println(Arrays.toString(arr2));
    }

    private static void rightRotate(int[] arr2, int k) {
        int n = arr2.length;
        k%=n;
        reverse(arr2, 0, n-k-1);
        reverse(arr2, n-k, n-1);
        reverse(arr2, 0, n-1);
    }

    private static void reverse(int[] a, int i, int j) {
        while(i<j){
            int temp = a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }

    private static void LeftRotate(int[] arr1, int k) {
        int n = arr1.length;
        k%=n;
        reverse(arr1, 0, k-1);
        reverse(arr1, k, n-1);
        reverse(arr1, 0, n-1);
    }

}
