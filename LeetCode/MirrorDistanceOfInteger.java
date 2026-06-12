package LeetCode;

public class MirrorDistanceOfInteger {
    public static void main(String[] args) {
        int a = 25;
        System.out.println(solve(a));
        int n = 123456;
        int reverse = 0;
        while(n>0){
            reverse = (reverse*10) + (n%10);
            n/=10;
        }
        System.out.println(reverse);
    }

    private static int solve(int a) {
        StringBuilder st = new StringBuilder();
        st.append(a);
        st.reverse();
        int b = Integer.parseInt(st.toString());
        return Math.abs(a-b);
    }
}
