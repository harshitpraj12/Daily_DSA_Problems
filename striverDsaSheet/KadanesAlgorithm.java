package striverDsaSheet;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int [] arr = {-2, 4, 5, -5, 6, -2, 9};
        int max = arr[0];
        int i=0;
        int j=0;
        int k =0;
        int currSum = arr[0];
        for(int a=1; a<arr.length; a++){
            if(arr[a]>currSum+arr[a]){
                currSum=arr[a];
                j=a;
            }else{
                currSum+=arr[a];
            }
            if(currSum>max){
                max=currSum;
                i=j;
                k=a;
            }
            // currSum+=arr[a];
            // if(currSum>max) max = currSum;
            // if(currSum<=0) currSum=0;
        }
        for(int a=i; a<=k; a++){
            System.out.print(arr[a]+" ");
        }
        // System.out.println(max);
    }
}
