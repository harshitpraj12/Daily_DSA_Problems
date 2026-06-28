package LeetCode;

import java.util.Scanner;

public class ParkingCharge {
    public static void main(String[] args) {
        System.out.print("Enter number of hours parked : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int amount = solve(a);
        System.out.println("Total bill : "+ amount);
        sc.close();
    }

    private static int solve(int a) {
        int ans = 0;
        if(a<=0) return 0;
        for(int i=1; i<=a; i++){
            if(i<=2){
                ans+=100;
            }else if(i>2 && i<=5){
                ans+=50;
            }else if(i>5){
                ans+=20;
            }
        }
        return ans;
    }
}
