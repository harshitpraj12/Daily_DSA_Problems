package Array;

import java.util.Arrays;

// import java.util.HashMap;

public class TwoSumArray {
    public static void main(String[] args) {
        int [] arr = {2, 6, 5, 8, 11};
        int a = 14;

        // // BruteForce Approach

        // for(int i=0; i<arr.length; i++){
        //     // int sum = arr[i];
        //     for(int j=i+1; j<arr.length; j++){
        //         if(arr[i]+arr[j]==a){
        //             System.out.println("Yes, number is avilable.");
        //             System.out.println("index is: "+ i+", "+ j);
        //             break;
        //         }
        //     }
        // }
        
        // Better Approach
        
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<arr.length; i++){
        //     int avl = arr[i];
        //     int req = a - avl;
        //     if(map.containsKey(req)){
        //         System.out.println("yes: "+arr[i]+", "+ req);
        //     }
        //     map.put(avl, req); 
        // }

        // Optimal Solultion (Using Two pointer Approach)

        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            if(arr[left]+arr[right]==a){
                System.out.println("Yes Avilable!");
                break;
            }else if(arr[left]+ arr[right]>a){
                right--;
            }else{
                left++;
            }
        }
        
    }
}
