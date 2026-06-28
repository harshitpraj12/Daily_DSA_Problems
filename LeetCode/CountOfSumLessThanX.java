package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CountOfSumLessThanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        System.out.print("Enter element of array : ");
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter sum value : ");
        int x = sc.nextInt();
        int ans = solve(arr, x);
        System.out.println(ans);
    }

    private static int solve(int[] arr, int x) {
        int count =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int next = x-arr[i];
            if(map.containsKey(next)){
                count++;
            }
            map.put(arr[i], next);
        }
        return count;

    }
}
