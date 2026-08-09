package striverDsaSheet;

import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) {
        int [] arr = {3, 2, 1};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void nextPermutation(int[] num) {
        if(num==null || num.length<=1){
            return;
        }
        int i = num.length-2;
        while(i>=0 && num[i]>=num[i+1]) i--;
        if(i>=0){
            int j = num.length-1;
            while(num[j]<=num[i]) j--;
            swap(num, i, j);
        }
        reverse(num, i+1, num.length-1);
    }
    public static void reverse(int[] num, int i, int j) {
        while(i<j){
            swap(num, i, j);
            i++;
            j--;
        }
    }

    public static void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}