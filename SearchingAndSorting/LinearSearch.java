package SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int arr [] = {34, 12, 64, 7, 4, 32, 65, 82, 43, 54};
        Arrays.sort(arr);
        System.out.println("Array: "+Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int ele = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if(arr[i]==ele){
                System.out.println("Element found at index "+ i);
                break;
            }
        }
        sc.close();
    }
}
