package Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {4, 1, 2, 3, 1};
        int target = 5;

        //  Better approach for solving

        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i<arr.length; i++){
        //     map.put(i, arr[i]);
        // }
        // for(int i=0; i<arr.length; i++){
        //     int a = target-arr[i];
        //     if(map.containsValue(a)){
        //         System.out.println("two numbers are: "+ arr[i]+ ", "+ a+" at index "+ i+", ");
        //     }
        // }

        // Optimized approach

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], i);
        }
        
        int left = 0;
        int right = arr.length-1;
        Arrays.sort(arr);
        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum == target){
                System.out.println("Yes");
                System.out.println("Number is : "+ arr[left]+", "+ arr[right]);
                System.out.println("At index: "+ map.get(arr[left])+", "+ map.get(arr[right]));
                break;
            }else if(sum>target){
                right--;
            }else{
                left++;
            }
        }
    }
    
}
