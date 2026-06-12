package Array;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
       int [] arr = {3, 53, 4, 32, 87,3, 2, 5, 75, 34 ,23};
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter element to search: ");
       int ele = sc.nextInt();
       for(int i=0; i<arr.length; i++){
            if(arr[i]==ele){
                System.out.println("Element is fount at index "+ i);
            }
       }
       sc.close();
    }
}
