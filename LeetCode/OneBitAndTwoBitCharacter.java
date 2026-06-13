package LeetCode;

public class OneBitAndTwoBitCharacter {
    public static void main(String[] args) {
        int [] bit = {1};
        if(solve(bit)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    private static boolean solve(int[] bit) {
        int n = bit.length;
        int shift = 0;
        while(shift!=n){
            if(shift==n-1 && bit[shift]==1) return false;
            if(shift==n-1 && bit[shift]==0) return true;
            if(bit[shift]==1) shift+=2;
            else shift+=1;
        }
        return false;
    }
}
