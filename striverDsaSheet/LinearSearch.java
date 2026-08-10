package striverDsaSheet;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {43, 65, 12, 98, 52, 63, 7, 79, 23, 97};
        int ele = 63;
        int a = solve(arr, ele);
        System.out.println(a);
    }

    private static int solve(int[] arr, int ele) {
        for(int i=0; i<arr.length; i++){
            if(arr[i]==ele){
                return i;
            }
        }
        return -1;
    }
}
