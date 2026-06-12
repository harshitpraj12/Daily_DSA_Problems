package Array;

public class secondLargest2 {
    public static void main(String[] args) {
        int [] arr = {3, 53, 4, 32, 87,3, 2, 5, 75, 34 ,23};
        int largest = -1;
        int secondLargest = -1;
        int tl = -1;
        // for(int i = 0; i<arr.length; i++){
        //     if(arr[i]>largest){
        //         tl = secondLargest;
        //         secondLargest = largest;
        //         largest = arr[i];
        //     }else if(arr[i]<largest && arr[i]>secondLargest){
        //         secondLargest = arr[i];
        //     }else if(arr[i]<largest && arr[i]<secondLargest && arr[i]>tl){
        //         tl = arr[i];
        //     }
        // }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                tl = secondLargest;
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i]>secondLargest && arr[i]<largest){
                tl = secondLargest;
                secondLargest = arr[i];
            }else if(arr[i]>tl && arr[i]<secondLargest){
                tl = arr[i];
            }
        }
        System.out.println("Largest : "+ largest);
        System.out.println("Second largest : "+ secondLargest);
        System.out.println("Third largest : "+ tl);
    }
}
