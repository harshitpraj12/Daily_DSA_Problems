package tcs;

import java.util.Scanner;

public class LcmAndGcd {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm = Lcm(a, b);
        int gcd = Gcd(a, b);
        System.out.println("Number is : "+ a +", "+b);
        System.out.println("LCM : "+ lcm);
        System.out.println("GCD : "+ gcd);
        sc.close();
    }

    private static int Gcd(int a, int b) {
        while (b!=0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    private static int Lcm(int a, int b) {
        return ((a/Gcd(a, b)*b));
    }
}
