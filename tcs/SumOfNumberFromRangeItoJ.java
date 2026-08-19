package tcs;

import java.util.Scanner;

public class SumOfNumberFromRangeItoJ{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        if(i>=j || i<0 || j>=10000){
            System.out.println("Invalid Input");
        }else{
            System.out.println(solve(i, j));
        }
        sc.close();
    }

    private static int solve(int i, int j) {
        return (((j*(j+1))/2)-((i*(i-1))/2));
    }
}
