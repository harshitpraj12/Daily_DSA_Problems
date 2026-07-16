package Flipkart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice1 {
    public static void main(String[] args) {
        String [] arr = {"0x201f4zf40w", "ex048sk9", "50"};
        int n = 3;
        solve(arr, n);
        String str = "9dah34250jasd0has045ns356";
        String [] token = str.split("[^0-9]+");
        System.out.println(Arrays.toString(token));
    }

    private static void solve(String[] arr, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<arr[i].length(); j++){
                int a = 0;
                if(Character.isDigit(arr[i].charAt(j))){
                    a = arr[i].charAt(j)-'0';
                }
                while(
                    j<arr[i].length()-1 && 
                    Character.isDigit(arr[i].charAt(j)) && 
                    Character.isDigit(arr[i].charAt(j+1))
                ){
                    a=a*10+arr[i].charAt(j+1)-'0';
                    j++;
                }
                if(Character.isDigit(arr[i].charAt(j))){
                    list.add(a);
                }
            }
        }
        Collections.sort(list);
        for(int k : list){
            // System.out.println(k);
        }
    }
}
