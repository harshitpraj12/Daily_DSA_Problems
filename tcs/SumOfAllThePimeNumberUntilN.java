package tcs;

public class SumOfAllThePimeNumberUntilN {
    public static void main(String[] args) {
        int n = 100;
        int ans = solve(n);
        System.out.println(ans);
    }

    private static int solve(int n) {
        if(n<=0) return 0;
        if(n==1) return 0;
        if(n==2) return 2;
        if(n==3 || n==4) return 5;
        int sum = 5;
        for(int i=5; i<=n; i+=2){
            if (i % 3 == 0) {
                if (i == 3) sum += i;
                continue; 
            }
            boolean isPrime = true;
            for(int j=5; j*j<=i; j+=6){
                if(i%j==0 || i%(j+2)==0) isPrime = false;
                break;
            }
            if(isPrime) sum+=i;
        }
        return sum;
    }
}
