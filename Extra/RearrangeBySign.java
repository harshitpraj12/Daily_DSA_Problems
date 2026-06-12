import java.util.Arrays;

public class RearrangeBySign {
    public static void main(String[] args) {
        int [] arr = {3, 1, -2, -5, 2, -4};
        int [] a = new int[arr.length];
        
        int pos = 0;
        int neg = 1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                a[pos] = arr[i];
                pos+=2;
            }else{
                a[neg] = arr[i];
                neg+=2;
            }
        }

        System.out.println("Rearranged array is : "+ Arrays.toString(a));
    }
}
