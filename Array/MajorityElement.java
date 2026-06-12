package Array;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 1, 2, 2};
        int[] arr1 = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5};

        //  BruteForce Approach     TC = O(n^2)

        for(int i=0; i<arr.length; i++){
            int count=0;
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>arr.length/2){
                System.out.println("Majority Element is: "+ count);
                break;
            }
        }

        //  Better Approach   TC = O(n log N)

        HashMap<Integer, Integer> a = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            a.put(arr[i], a.getOrDefault(arr[i], 0)+1);
            if(a.get(arr[i])>arr.length/2){
                System.out.println("Majority Element is: "+ arr[i] +" which came "+ a.get(arr[i])+" times.");
                break;
            }
        }

        // Optimal Approach(Moore's voting algorithm) TC = O(n)

        int cnt = 1;
        int maz = arr1[0];
        for(int i=1; i<arr1.length; i++){
            if(cnt!=0){
                if(arr1[i]==maz){
                    cnt++;
                }else{
                    cnt--;
                }
            }else{
                maz= arr1[i];
            }
        }
        System.out.println("Majority element is: "+ maz);
    }
}
