package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigit {
    public static void main(String[] args) {
        int low = 1000;
        int high = 13000;
        List<Integer> list = solve(low, high);
        System.out.println(list);
    }

    private static List<Integer> solve(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        int m = 0;
        int temp = low;
        while(temp!=0){
            m=temp%10;
            temp/=10;
        }
        // while(temp>=low && temp<=high){
        //     nu
        // }
        String str = "123456789";
        int l = Integer.toString(low).length();
        int h = String.valueOf(high).length();
        for(int i=l; i<=h; i++){
            for(int j=0; j<=9-i; j++){
                int end = j+i;
                String sub = str.substring(j, end);
                int num = Integer.parseInt(sub);
                if(num>=low && num<=high){
                    ans.add(num);
                }
            }
        }
        return ans;
    }
}
