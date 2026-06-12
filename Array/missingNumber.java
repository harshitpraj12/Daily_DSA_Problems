package Array;


public class missingNumber {
    public static void main(String[] args) {
        int [] arr = {1, 2, 4, 3, 6, 7};
        int n= arr.length+1;
        // int real = (n*(n+1))/2;
        // int ima = 0;
        // for(int ele: arr){
        //     ima+=ele;
        // }
        // int ans = real-ima;
        // System.out.println("Missing number is: "+ ans);
        int xor1 = 0;
        // for(int i=1; i<=n; i++){
        //     xor1 = xor1^i;
        // }
        int xor2 = 0;
        for(int i=0; i<arr.length; i++){
            xor2 = xor2^arr[i];
            xor1 = xor1^(i+1);
        }
        xor1 = xor1^n;
        int ans = xor1^xor2;
        System.out.println("Missing Number is: "+ ans);
        
    }
}
