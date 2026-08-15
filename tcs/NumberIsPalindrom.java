package tcs;

public class NumberIsPalindrom {
    public static void main(String[] args) {
        int num = 04;
        int a = num;
        int k = 0;
        while(a!=0){
            int n = a%10;
            k=k*10+n;
            a/=10;
        }
        if(k==num) System.out.println("YES");
        else System.out.println("NO");
    }
}
