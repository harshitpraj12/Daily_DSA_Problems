package Array;

import java.util.ArrayList;

public class MissingElementInRange {
    public static void main(String[] args) {
        int [] arr = {1, 4, 11, 51, 15};
        int low = 50;
        int high = 55;
        
        ArrayList<Integer> ans = missingRange(arr, low, high);
        System.out.println(ans);
    }

    private static ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        ArrayList<Integer> ans = new ArrayList<>();
        while(low<=high){
            boolean a = false;
            for(int i=0; i<arr.length; i++){
                if(arr[i]==low){
                    a = true;
                }
            }
            if(a){
                low++;
            }else{
                ans.add(low);
                low++;
            }
        }
        return ans;
    }
}
