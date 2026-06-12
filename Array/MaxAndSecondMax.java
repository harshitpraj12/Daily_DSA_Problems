package Array;

public class MaxAndSecondMax {
    public static void main(String[] args) {
        int [] arr1 = {1, 3, 2, 4, 5, 3, 2, 4, 6};
        int [] arr2 = {2, 2, 2, 2, 2, 2, 3};
        int [] arr = {1, 3, 2};
        int max = 0;
        int smax = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }else if(arr[i]> smax && arr[i]!=max){
                smax = arr[i];
            }
        }
        System.out.println(max+", "+ smax);
    }
}
