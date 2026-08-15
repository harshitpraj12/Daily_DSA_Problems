package tcs;

public class Armstrong {
    public static void main(String[] args) {
        int n = 1634;
        int len = Integer.toString(n).length();
        int a = n;
        int ans = 0;
        while(a!=0){
            int k = a%10;
            ans+=(Math.powExact(k, len));
            a/=10;
        }
        if(ans==n) System.out.println("IS PALINDROM");
        else System.out.println("NOT A PALINDROM");
    }
}
