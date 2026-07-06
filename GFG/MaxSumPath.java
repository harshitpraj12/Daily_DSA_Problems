package GFG;

import java.util.HashMap;

public class MaxSumPath {
    public static void main(String[] args) {
        int [] a = {2, 3, 7, 10, 12};
        int [] b = {1, 5, 7, 8};
        System.out.println(solve(a, b));
    }

    private static int solve(int[] a, int[] b) {
        // HashMap<Integer, Integer> mapA = new HashMap<>();
        // HashMap<Integer, Integer> mapB = new HashMap<>();
        // for(int i = 0; i<a.length; i++){
        //     mapA.put(a[i], i);
        // }
        // for(int i = 0; i<b.length; i++){
        //     mapA.put(b[i], i);
        // }
        // int sum = 0;
        // if(a[0]<b[0]){

        // }
        int i=0, j=0;
        int sum1 = 0, sum2=0, result = 0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                sum1+=a[i++];
            }else if(b[j]<a[i]){
                sum2+=b[j++];
            }else{
                result+=Math.max(sum1, sum2)+a[i];
                sum1=0;
                sum2=0;
                i++;
                j++;
            }
        }
        while(i<a.length){
            sum1+=a[i++];
        }
        while(j<b.length){
            sum2+=b[j++];
        }
        result+=Math.max(sum1, sum2);
        return result;
    }
}
