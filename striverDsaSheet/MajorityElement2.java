package striverDsaSheet;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    public static void main(String[] args) {
        int [] arr = {2,1,1,3,1,4,5,6};
        List<Integer> ans = solve(arr);
        System.out.println(ans);
    }

    private static List<Integer> solve(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int count1 = 0;
        int count2 = 0;
        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MIN_VALUE;
        for(int n : arr){
            if(num1==n){
                count1++;
            }else if(num2==n){
                count2++;
            }else if(count1==0){
                num1=n;
                count1 = 1;
            }else if(count2==0){
                num2=n;
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int num : arr) {
            if (num == num1) count1++;
            else if (num == num2) count2++;
        }

        int threshold = arr.length / 3;
        if (count1 > threshold) ans.add(num1);
        if (count2 > threshold) ans.add(num2);
        return ans;
    }
}
