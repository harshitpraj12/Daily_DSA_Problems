package DivideAndConquer;

public class FindMaxAndMin {
    public static void main(String[] args) {
        int [] arr = {-23, 34, 65, 2, 8, -2, 64, 87, 21, 45};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Maximun value is: "+ max);
        System.out.println("Minimun value is: "+ min);
    }
}
