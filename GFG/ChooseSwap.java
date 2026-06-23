package GFG;

import java.util.Arrays;

public class ChooseSwap {
    public static void main(String[] args) {
        String str = "ccad";
        String ans = solve(str);
        System.out.println(ans);
    }

    private static String solve(String str) {
        char [] arr = str.toCharArray();
        int [] first = new int[26];
        Arrays.fill(first, -1);
        for(int i=0; i<arr.length; i++){
            int idx = arr[i]-'a';
            if(first[idx]==-1){
                first[idx] = i;
            }
        }
        for(int i=0; i<arr.length; i++){
            char curr = arr[i];
            char target = ' ';
            boolean foundSwap = false;
            for(char c = 'a'; c<curr; c++){
                int smallIdx = c-'a';
                if(first[smallIdx]!=-1 && first[smallIdx]>i){
                    target = c;
                    foundSwap = true;
                    break;
                }
            }
            if(foundSwap){
                char a1 = curr;
                char a2 = target;
                for(int j=0; j<arr.length; j++){
                    if(arr[j]==a1){
                        arr[j]=a2;
                    }else if(arr[j]==a2){
                        arr[j]=a1;
                    }
                }
                return new String(arr);
            }
        }
        return str;
    }
}
