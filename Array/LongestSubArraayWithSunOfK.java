package Array;

public class LongestSubArraayWithSunOfK {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int k = 4;

        int maxSun = 0;
        int windowMax = 0;

        for(int i=0; i<k; i++){
            windowMax += arr[i];
        }

        maxSun = windowMax;

        for(int i=k; i<arr.length; i++){
            windowMax += arr[i] - arr[i-k];
            maxSun = Math.max(maxSun, windowMax);
        }

        System.out.println("Max sum of subarray of size "+ k + " : "+ maxSun);
    }
}
