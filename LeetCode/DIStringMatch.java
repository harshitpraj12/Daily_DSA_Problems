package LeetCode;

import java.util.Arrays;

public class DIStringMatch {
    public static void main(String[] args) {
        String str = "DDI";
        int [] arr = solve(str);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] solve(String str) {
        int low = 0;
        int high = str.length();
        int [] arr = new int[high+1];
        int idx = 0;
        for(char c : str.toCharArray()){
            if(c=='I'){
                arr[idx++] = low++;
            }else{
                arr[idx++] = high--;
            }
        }
        arr[idx]= high;
        return arr;
    }
}
