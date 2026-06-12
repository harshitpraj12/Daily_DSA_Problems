package Array;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int [] arr = {2, 3, -2, 4, 1, 3, -4, -3, 0, 4, 4, 4, 4, 4, 5};
        int n = arr.length;
        int pro=0;
        for(int i = 0; i<n; i++){
            int sub=1;
            for(int j=i; j<n; j++){
                sub*=arr[j];
                if(sub>pro){
                    pro=sub;
                }
            }
        }
        System.out.println("Maximum product is: "+ pro);

        // Optimal Approach(Observation)

        int pre = 1;
        int suff = 1;
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(pre == 0) pre = 1;
            if(suff == 0) suff = 1;
            pre = pre * arr[i];
            suff = suff * arr[n-i-1];
            ans = Math.max(ans, Math.max(pre, suff));
        }
        System.out.println("Optimal approach: "+ ans);
    }
}
