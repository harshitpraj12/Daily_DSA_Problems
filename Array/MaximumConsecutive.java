package Array;

public class MaximumConsecutive {
    public static void main(String[] args) {
        int arr [] = {1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0};
        int max = 0;
        int smax = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                smax+=1;
                if(smax>max){
                    max = smax;
                }
            }else{
                smax = 0;
            }
        }
        System.out.println("Max is: "+ max);
    }
}
