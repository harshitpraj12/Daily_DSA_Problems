package SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch1 {
    public static void main(String[] args) {
        int arr [] = {34, 12, 64, 7, 4, 32, 65, 82, 43, 54};
        Arrays.sort(arr);
        int l = 0, n = arr.length-1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int ele = sc.nextInt();
        while(l<n){
            int mid = (l+n)/2;
            if(arr[mid]==ele){
                System.out.println("Element found at index "+ mid);
                break;
            }else if(ele<arr[mid]){
                n=mid-1;
            }else{
                l=mid+1;
            }
        }
        sc.close();
    }
}
