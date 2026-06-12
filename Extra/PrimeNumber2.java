

public class PrimeNumber2 {
    public static void main(String[] args) {
        int a = 71;
        if(solve(a)){
            System.out.println("Prime");
        }else{
            System.out.println("Non Prime");
        }
        if(solved(a)){
            System.out.println("Prime");
        }else{
            System.out.println("Non Prime");
        }
    }

    private static boolean solved(int a) {
        if(a<=1) return false;
        if(a<=3) return true;
        if(a%2==0 || a%3==0) return false;
        for(int i=5; i*i<a; i+=6){
            if(a%i==0 || a%(i+2)==0) return false;
        }
        return true;
    }

    private static boolean solve(int a) {
        boolean ans = true;

        for(int i=2; i<=Math.sqrt(a); i++){
            if(a%i==0){
                ans = false;
                break;
            }
        }
        return ans;
    }
}
