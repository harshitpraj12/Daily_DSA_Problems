package striverDsaSheet;

public class SecondLargestElement {
    public static void main(String[] args) {
        int [] arr = {43, 65, 12, 34, 90, 14, 84, 84, 1, 65, 90};
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){

            if(arr[i]>max){
                sMax = max;
                max = arr[i];
            }else if(arr[i]>sMax && arr[i]<max){
                sMax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(sMax);
    }
}
