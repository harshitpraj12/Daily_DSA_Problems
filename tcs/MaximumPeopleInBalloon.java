package tcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MaximumPeopleInBalloon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for(int i=0; i<n; i++){
        //     arr[i]=sc.nextInt();
        // }
        // int y = sc.nextInt();
        // System.out.println(solve(n, arr, y));
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(45, 34, 56, 78, 12, 32));
        // Collections.sort(a);
        // System.out.println(a);
        // Collections.reverse(a);
        // System.out.println(a);
        a.sort(Comparator.naturalOrder());
        System.out.println(a);
        a.sort(Comparator.reverseOrder());
        System.out.println(a);
    }

    private static int solve(int n, int[] arr, int y) {
        Arrays.sort(arr);
        int count = 0;
        for(int i=0; i<n; i++){
            if(y>=arr[i]){
                y-=arr[i];
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}
