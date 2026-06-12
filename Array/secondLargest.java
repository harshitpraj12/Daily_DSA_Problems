package Array;

public class secondLargest {
    public static void main(String[] args) {
        int [] arr = {3, 53, 4, 32, 87,3, 2, 5, 75, 34 ,23};
        int largest = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("Largest number is: "+ largest);
        int sl = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>sl && arr[i]<largest){
                sl = arr[i];
            }
        }
        System.out.println("Second Largest number: "+ sl);
    }
}
