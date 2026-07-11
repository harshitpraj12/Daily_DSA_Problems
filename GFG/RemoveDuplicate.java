package GFG;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        int n = solve(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static int solve(int[] arr) {
        if(arr.length==0) return 0;
        if(arr.length==1) return 1;
        int idx=1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                arr[idx++]=arr[i];
            }
        }
        return idx;
    }
}
