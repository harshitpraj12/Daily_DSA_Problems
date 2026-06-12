package LeetCode;

import java.util.Arrays;

public class potd66 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int n = arr.length;
        // int ans[] = new int[n+1];
        // int a =0;
        // for(int i=0; i<n; i++){
        //     a=a*10+arr[i];
        // }
        // a++;
        // int b=a;
        // System.out.println("Digit is: "+ a);
        // int k;
        // for(int i=ans.length-1; i>=0; i--){
        //     k=a%10;
        //     ans[i]=k;
        //     a=a/10;
        // }
        // if(ans[0]==0){
        //     int ans1[] = new int[n];
        //     for(int i=ans1.length-1; i>=0; i--){
        //     k=b%10;
        //     ans1[i]=k;
        //     b=b/10;
        // }
        // System.out.println("Answer array is :" + Arrays.toString(ans1));
        // }
        // System.out.println("Answer array is :" + Arrays.toString(ans));
        

        //  Second try


        // if(arr[n-1]<9){
        //     arr[n-1]+=1;
        //     System.out.println("Answer array is :" + Arrays.toString(arr));
        // }else{
        //     for(int i = n-1; i>=0; i--){
        //         if(arr[i])
        //     }
        // }
        for(int i=n-1; i>=0; i--){
            if(arr[i]<9){
                arr[i]++;
                System.out.println(Arrays.toString(arr));
            }
            arr[i]=0;
        }
        int result[] = new int[n+1];
        result[0]=1;
        System.out.println(Arrays.toString(result));
    }
}
