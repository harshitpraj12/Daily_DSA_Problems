package GFG;

public class DiceThrowDemo {
    public static void main(String[] args) {
        int n = 2;
        int m = 2;
        int x = 2;
        System.out.println("Answer is : "+ solve(n, m, x));
    }

    private static int solve(int dice, int face, int mul) {
        if(dice==0 && mul==1) return 1;
        if(dice==0 || mul<1) return 0;
        
        int ways = 0;

        for(int i=1; i<=face; i++){
            ways+=solve(dice-1, face, mul/i);
        }
        return ways;
    }
}
