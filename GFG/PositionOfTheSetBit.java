package GFG;

public class PositionOfTheSetBit {
    public static void main(String[] args) {
        int n = 4; //101
        System.out.println(solve(n));
        System.out.println(Math.log(n));
    }

    private static int solve(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        if(n%2!=0) return -1;
        int count=0;
        while (n!=1) {
            if((n&1)==1) return -1;
            else{
                count++;
                n>>=1;
            }
        }
        return count+1;
    }
}
