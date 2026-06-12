package Array;

import java.util.HashMap;

public class One {
    public static void main(String[] args) {
        int [] max = {3, 0, 1, 0, 4, 0, 2};
        int n = max.length;
        // min[0]=min[0];
        // for(int i=0; i<n-1; i++){
        //     if(min[i]>min[i+1]){
        //         min[i+1] = min[i];
        //     }
        // }
        for(int i=n-1; i>0; i--){
            if(max[i]>max[i-1]){
                max[i-1] = max[i];
            }
        }
        for(int a: max){
            System.out.print(a+" ");
        }
    }
}
