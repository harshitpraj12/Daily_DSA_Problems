package Array;

public class numberAppearOnce {
    public static void main(String[] args) {
        // XOR--- when same number it gives output 0, and when different it gives 1 while input of 0 and 1.
        int [] arr = {1, 1, 2, 3, 3, 4, 4, 5, 5};
        // for(int i=0; i<arr.length; i++){
        //     int count = 0;
        //     for(int j=0; j<arr.length; j++){
        //         if(arr[i]==arr[j]){
        //             count++;
        //         }
        //     }
        //     if(count==1){
        //         System.out.println("Number is: "+ arr[i]);
        //     }
        // }
        int xor = 0;
        for(int i=0; i<arr.length; i++){
            xor = xor^arr[i];
        }
        System.out.println("Element is: "+ xor);
    }
}
