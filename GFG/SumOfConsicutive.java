package GFG;

public class SumOfConsicutive {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(solve(n));
    }

    private static int solve(int n) {
        int count = 0;
        // int sum = 0;
        // int i=1;
        // int idx=1;
        // while(i<=n/2+2){
        //     if(sum<=n){
        //         sum+=i;
        //         i++;
        //     }
        //     if(sum>n){
        //         sum=sum-idx;
        //         idx++;
        //     }
        //     if(sum==n) count++;
        // }

        // return count;
        for(long k = 2; ; k++){
            long baseSum = (k*(k-1))/2;
            if(baseSum>=n) break;
            if((n-baseSum)%k==0) count++;
        }
        return count;
    }
}
