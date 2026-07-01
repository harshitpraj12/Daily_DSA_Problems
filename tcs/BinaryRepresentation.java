package tcs;

public class BinaryRepresentation {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(solve(a));
    }

    private static int solve(int a) { 
        String ab = "";
        while(a!=0){
            ab = (a&1) + ab;
            a>>=1;
        }
        ab = ab.replace('0', '2');
        ab = ab.replace('1', '0');
        ab = ab.replace('2', '1');
        int ans = Integer.parseInt(ab, 2);
        return ans;
    }
}
