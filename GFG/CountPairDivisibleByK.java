package GFG;

public class CountPairDivisibleByK {
    public static void main(String[] args) {
        int [] arr = {5, 9, 36, 74, 52, 31, 42};
        int k = 3;
        System.out.println(solve(arr, k));
    }

    private static int solve(int[] arr, int k) {
        int count = 0;
        int [] freq = new int[k];
        for(int a : arr){
            int rem = a%k;
            int need = (k-rem)%k;
            count+=freq[need];
            freq[rem]++;
        }
        return count;
    }
}
