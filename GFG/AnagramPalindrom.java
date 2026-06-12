package GFG;

public class AnagramPalindrom {
    public static void main(String[] args) {
        String str = "geeksogeeks";
        if(solve(str)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    private static boolean solve(String str) {
        if(str==null || str.length()==1 || str.isEmpty()) return true;
        int arr[] = new int[26];
        for(char c : str.toCharArray()){
            arr[c-'a']= arr[c-'a']+1;
        }
        int odd = 0;
        for(int i=0; i<26; i++){
            if(arr[i]%2!=0){
                odd++;
            }
        }
        if(odd<=1){
            return true;
        }else{
            return false;
        }
    }
}
