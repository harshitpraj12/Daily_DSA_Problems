package tcs;

public class PrimeOrNot {
    public static void main(String[] args) {
        int n = 2;
        if(solve(n)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    private static boolean solve(int n) {
        if(n<=1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5; i*i<n; i+=6){
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
}
