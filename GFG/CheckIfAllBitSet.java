package GFG;

public class CheckIfAllBitSet {
    public static void main(String[] args) {
        int a = 15;
        if(solve(a)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    private static boolean solve(int a) {
        if(a<=0) return false;
        while(a!=0){
            if((a&1)!=1){
                return false;
            }
            a>>=1;
        }
        return true;
    }
}
